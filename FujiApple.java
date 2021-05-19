package Exercise4_6;

public class FujiApple extends Apple{
	
	public FujiApple(String n, double q, double p){
		super(n,q,p);
	}
	
	public String printBenefit() { //overriding method
		return "\nFuji apples can boosts brain health.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
