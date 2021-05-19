package Exercise4_6;

class AppleTotalPrice implements Price { //sub class for interface Price
	public double totalPrice(double q) { //same method as in Price
		return 2.30 * q; //with body
						 //2.30 is the new price for apple
	}

	public double totalPrice(double q, double d) { //same method in Price
		return (1.99 * q) - ((1.99 * q) * d); //with body
											  //1.99 is the new price for apple
	}
	
}
class LycheeTotalPrice implements Price { //sub class for interface Price
	public double totalPrice(double q) { //same method in Price
		return 11.99 * q; //with body
						  //11.99 is the new price for apple
	}

	public double totalPrice(double q, double d) { //same method in Price
		return (10.99 * q) - ((10.99 * q) * d); //with body
											   //10.99 is the new price for apple
	}	
	
}

class CherryTotalPrice implements Price { //sub class for interface Price
	public double totalPrice(double q) { //same method as in Price
		return 85.99 * q; //with body
						  //85.99 is the new price for apple
	}

	public double totalPrice(double q, double d) { //same method in Price
		return (79.99 * q) - ((79.99 * q) * d); //with body
									  			//79.99 is the new price for apple
	}
	
}
