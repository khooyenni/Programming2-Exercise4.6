package Exercise4_6;

public class Lychee extends Apple {

	public Lychee(String n, int q, double p) {
		super(n, q, p);
	}
	
	public String printBenefit() { //overriding method
		return "Lychee contain Magnesium, copper, iron, vitamin C, manganese and folate.";
	}

	public String toString() { //overriding method
		return printBenefit();
	}

}
