
public class Payment {
	private double paymentAmount;
	
	Payment(double paymentAmount){
		this.paymentAmount=paymentAmount;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public String paymentDetails(){
		return "Payment amount: " + paymentAmount + "\n";
	}
	
	
}
