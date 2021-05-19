package Exercise4_6;

public abstract class Fruits {
	
	private String name;
	
	public String printBenefit() {
		return "People who eat more fruits as part of an overall healthy diet are likely to have a reduced risk of some chronic diseases.";
	}
	
	public Fruits(String n) { 
		name = n;
		System.out.println(name + " constructor is invoked.");
	}

	
}
