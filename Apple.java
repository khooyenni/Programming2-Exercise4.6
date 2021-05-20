package Exercise4_6;

public class Apple extends Fruits{
	
	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		quantity = q;
		price = p;
		
		System.out.println("Fruit\t\t : " + n);
		
		Price atp = new AppleTotalPrice();
		Price ltp = new LycheeTotalPrice();
		Price ctp = new CherryTotalPrice();
		
		if (quantity<10) {
			System.out.println("Quantity bought  : " + quantity);
			System.out.printf("Price per "+ n + "  : RM%.2f\n", price);
			System.out.printf("If quantity less than 10, the total price is RM%.2f\n", (price*quantity));
		}
		else if (quantity>=10 && quantity<=50) {
			if(n == "Apple" || n == "Granny Smith Apple"|| n == "Fuji Apple") {
				double aP = 2.30;
				System.out.println("Quantity bought  : " + quantity);
				System.out.printf("Price per "+ n + "  : RM%.2f\n", aP);
				System.out.printf("If quantity more than 10, the total price is RM%.2f", atp.totalPrice(q));
			}
			else if (n == "Lychee") {
				double lP = 11.99;
				System.out.println("Quantity bought  : " + quantity);
				System.out.printf("Price per "+ n + "  : RM%.2f\n", lP);
				System.out.printf("If quantity more than 10, the total price is RM%.2f", ltp.totalPrice(q));
			}
			else if (n == "Cherry") {
				double cP = 85.99;
				System.out.println("Quantity bought  : " + quantity);
				System.out.printf("Price per "+ n + "  : RM%.2f\n", cP);
				System.out.printf("If quantity more than 10, the total price is RM%.2f", ctp.totalPrice(q));
			}
		}
		else {
			if(n == "Apple" || n == "Fuji Apple" || n == "Granny Smith Apple") {
			double aP = 1.99; //new price for Apple
			Discount aD = new AppleDiscount(); //create new object
			double d = aD.rateofDiscount();
			System.out.println("Quantity bought  : " + quantity);
			System.out.printf("Price per "+ n + "  : RM%.2f\n", aP);
			System.out.println("Total Discount  : " + d*100 + "%");
			System.out.printf("If quantity more than 50, the total price is RM%.2f", atp.totalPrice(q,d));
			
		}
		
			else if (n == "Lychee") {
				double LP = 10.99; //new price for lychee
				Discount LD = new LycheeDiscount(); //create new object
				double d = LD.rateofDiscount();
				System.out.println("Quantity bought  : " + quantity);
				System.out.printf("Price per "+ n + "  : RM%.2f\n", LP);
				System.out.println("Total Discount  : " + d*100 + "%");
				System.out.printf("If quantity more than 50, the total price is RM%.2f", atp.totalPrice(q,d));
			}
			
			else if (n == "Cherry") {
				double cP = 79.99; //new price for Cherry
				Discount cD = new CherryDiscount(); //create new object
				double d = cD.rateofDiscount();
				System.out.println("Quantity bought  : " + quantity);
				System.out.printf("Price per "+ n + "  : RM%.2f\n", cP);
				System.out.println("Total Discount  : " + d*100 +"%");
				System.out.printf("If quantity more than 50, the total price is RM%.2f", atp.totalPrice(q,d));
			}
		}
		
	}
	
	public String printBenefit() { //overriding method
		return "\nApples are low in sodium, fat, and cholesterol and apples provide vitamin C and fiber. ";
	}
	
	public String toString() {
		return super.printBenefit();
	}

}
