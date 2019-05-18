import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class YahtzeeSpel {

	ArrayList<DobbelSteen> dobbels5 = new ArrayList<DobbelSteen>(5);
	int[] blokkeerarray = new int[5];

	YahtzeeSpel() {
		for (int i = 0; i < 5; i++) {
			this.dobbels5.add(i, new DobbelSteen());
		}
	}

	ArrayList<DobbelSteen> spelen() {
		Scanner sc = new Scanner(System.in);

		System.out.println("hierbij je eerste rij dobbelstenen:");
		System.out.println(12345);

		for (int i = 0; i < dobbels5.size(); i++) {
			dobbels5.get(i).werpen();
			System.out.print(dobbels5.get(i).getWaarde());
		}
		System.out.println();
		int worpen = 0;
		while (worpen < 3) {
			System.out.println("welke dobbels wil je bewaren?");
			String input = sc.nextLine();
			if (input.equals("q")) {
				System.out.println("we stoppen ermee");
				System.exit(0);
			} else {
				blokkeerarray = blokkeerArrayOmzet(input);

				for (int i = 0; i < dobbels5.size(); i++) {
					if (blokkeerarray[i] == 0) {
						dobbels5.get(i).werpen();
					}
					System.out.print(dobbels5.get(i).getWaarde());
				}
				System.out.println();
				worpen++;
			}
		}

		return dobbels5;

	}

	int[] blokkeerArrayOmzet(String input2) {
		int[] array1 = new int[5];
		for (int i = 0; i < 5; i++) {
			array1[i] = 0;
			for (int j = 1; j <= input2.length(); j++) {
				int i1 = Integer.parseInt(input2.substring(j - 1, j));
				if (i1 == i + 1)
					array1[i] = 1;
				else
					continue; // als je deze continue niet inbouwt loopt de hele boel vast
			}
		}
		return array1;
	}
}
