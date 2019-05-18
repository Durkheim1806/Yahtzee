import java.util.ArrayList;
import java.util.Arrays;

public class Worp {

	int[] array1 = new int[5];
	private String naam;
	int punten = 0;

	Worp() {
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	Worp(ArrayList<DobbelSteen> worp1) {
		for (int i = 0; i < worp1.size(); i++) {
			this.array1[i] = worp1.get(i).waarde;
		}
	}

	void uitslagWorp() {
		System.out.println("12345");
//		System.out.println(Arrays.toString(array1));
		for (int d : array1)
			System.out.print(d);
	}

	void berekenPunten() {
		for (int i = 0; i < 5; i++) {
			punten += array1[i];
		}
	}
}
