
public class CashPayment extends Payment {

	
	CashPayment(double paymentAmount) {
		super(paymentAmount);
		// TODO Auto-generated constructor stub
	}

	public String paymentDetails(){
		return "This payment is cash.\n " + super.paymentDetails();
	}
}
