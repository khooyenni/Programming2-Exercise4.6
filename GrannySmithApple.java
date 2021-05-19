package Exercise4_6;

public class GrannySmithApple extends Apple{
	
	public GrannySmithApple(String n, double q, double p){
		super(n,q,p);
	}
	
	public String printBenefit() { //overriding method
		return "Granny Smith apples may help you resist and fight cancer.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
