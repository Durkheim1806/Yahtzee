import java.util.Random;

public class DobbelSteen {

	int waarde;
	private boolean vasthouden = false;

	DobbelSteen() {
		Random rnd = new Random();
		int i = rnd.nextInt(6) + 1;
		this.waarde = i;
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}

	public boolean getVasthouden() {
		return vasthouden;
	}

	public void setVastHouden(boolean v) {
		this.vasthouden = v;
	}

	int werpen() {
		Random rnd = new Random();
		int i = rnd.nextInt(6) + 1;
		waarde = i;
		return i;
	}
}
