
public class CreditCardPayment extends Payment{
	
	String name;
	String expDate;
	String ccNum;
	
	
	CreditCardPayment(double paymentAmount, String name, String expDate, String ccNum) {
		super(paymentAmount);
		this.name = name;
		this.expDate = expDate;
		this.ccNum = ccNum;
	}
	
	public String paymentDetails(){
		return "Credit Card Payment: \n"
				+ "Name: " + name + "\n" 
				+ "Expiration Date: " + expDate + "\n"
				+ "Credit Name Number: " + ccNum + "\n"+ 
				super.paymentDetails();
	}

}
