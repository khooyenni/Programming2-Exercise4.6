package Exercise4_6; 

class AppleDiscount implements Discount{
	
	public double rateofDiscount() {
		return 0.05;//5% discount
	}

}

class CherryDiscount implements Discount{
	
	public double rateofDiscount() {
		return 0.08;//8% discount
	}
}

class LycheeDiscount implements Discount{
	
	public double rateofDiscount() {
		return 0.1; //10% discount
	}
}