import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Speler s1 = new Speler();

		YahtzeeSpel yahtzee1 = new YahtzeeSpel();

		System.out.println("welkom bij yahtzee");
		System.out.println("je krijgt 13 beurten, je moet deze combinaties vullen:");
		s1.dobbelsPrinten();

		System.out.println();
		System.out.println(
				"zodra je worp definitief is kan je kiezen welke combinatie je wilt vullen, dan worden de punten aan de combi toegevoegd");

		for (int i = 1; i < 14; i++) {
			System.out.println("dit is worp " + i);
			s1.worpen.add(new Worp(yahtzee1.spelen()));
			System.out.println("dit is de definitieve worp van " + i);
			s1.worpen.get(i - 1).uitslagWorp();
			s1.worpen.get(i - 1).berekenPunten();
			System.out.println();
			System.out.println("Waar wil je de worp wegzetten?");
			String input = sc.nextLine();
			s1.dobbelswegzetten(input, s1.worpen.get(i - 1));
			s1.berekenPuntenDef();
			System.out.println();
			s1.dobbelsPrinten();
			System.out.println(s1.worpenDef.get(0).getNaam());
			System.out.println();
		}
		for (int i = 0; i < s1.worpenDef.size(); i++) {
			System.out.print(s1.worpenDef.get(i).getNaam() + " " + s1.worpenDef.get(i).punten + "p");
			System.out.print(", ");
		}
		System.out.println();

	}
}
