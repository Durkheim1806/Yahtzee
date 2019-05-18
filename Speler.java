import java.util.ArrayList;

public class Speler {

	ArrayList<Worp> worpen = new ArrayList<Worp>();
	ArrayList<Worp> worpenDef = new ArrayList<Worp>(13);
	ArrayList<Worp> worpenTweedeRij = new ArrayList<Worp>(7);

	Speler() {
		for (int i = 0; i < 13; i++) {
			this.worpenDef.add(new Worp());
		}
		for (int i = 0; i < 6; i++) {
			this.worpenDef.get(i).setNaam((i + 1) + "-en");
		}

		this.worpenDef.get(6).setNaam("three of a kind");
		this.worpenDef.get(7).setNaam("carre");
		this.worpenDef.get(8).setNaam("kleine straat");
		this.worpenDef.get(9).setNaam("grote straat");
		this.worpenDef.get(10).setNaam("full house");
		this.worpenDef.get(11).setNaam("kans");
		this.worpenDef.get(12).setNaam("yahtzee");
	}

	void dobbelsPrinten() {
		for (int i = 0; i < worpenDef.size(); i++) {
			System.out.print(worpenDef.get(i).getNaam() + " " + worpenDef.get(i).punten + "p");
			System.out.print(", ");
		}
	}

	void dobbelswegzetten(String i, Worp w) {
		for (int k = 0; k < worpenDef.size(); k++) {
			if (i.equals(worpenDef.get(k).getNaam())) {
				w.setNaam(worpenDef.get(k).getNaam());
				worpenDef.set(k, w);
			} else
				continue;
		}
	}

	void berekenPuntenDef() {
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(0).array1[i] != 1)
				worpenDef.get(0).punten -= worpenDef.get(0).array1[i];
		}
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(1).array1[i] != 2)
				worpenDef.get(1).punten -= worpenDef.get(1).array1[i];
		}
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(2).array1[i] != 3)
				worpenDef.get(2).punten -= worpenDef.get(2).array1[i];
		}
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(3).array1[i] != 4)
				worpenDef.get(3).punten -= worpenDef.get(3).array1[i];
		}
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(4).array1[i] != 5)
				worpenDef.get(4).punten -= worpenDef.get(4).array1[i];
		}
		for (int i = 0; i < 5; i++) {
			if (worpenDef.get(5).array1[i] != 6)
				worpenDef.get(5).punten -= worpenDef.get(5).array1[i];
		}
		if (worpenDef.get(8).punten > 0) {
			worpenDef.get(8).punten = 30;
		}
		if (worpenDef.get(9).punten > 0) {
			worpenDef.get(9).punten = 40;
		}
		if (worpenDef.get(10).punten > 0) {
			worpenDef.get(10).punten = 25;
		}
		if (worpenDef.get(12).punten > 0) {
			worpenDef.get(12).punten = 50;
		}
	}

//	ArrayList<Worp>[][] worpen2 = 
}
