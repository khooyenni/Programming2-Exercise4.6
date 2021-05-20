package Exercise4_6;

public class Cherry extends Apple{
	
	public Cherry(String n, int q, double p) {
		super(n, q, p);
	}
	
	public String printBenefit() { //overriding method
		return "\nCherries contain vitamin C, A, K, potassium, magnesium, and calcium.";
	}
	
	public String toString() {
		return printBenefit();
	}

}
