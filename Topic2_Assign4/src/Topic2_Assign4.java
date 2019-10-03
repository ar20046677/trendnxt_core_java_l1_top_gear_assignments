
public class Topic2_Assign4 {

	public static void main(String[] args) {
		CashPayment cp1 = new CashPayment(45);
		CashPayment cp2 = new CashPayment(15);
		CreditCardPayment ccp1 = new CreditCardPayment(100, "Tim", "04/25", "1234-2345-3456-4567");
		CreditCardPayment ccp2 = new CreditCardPayment(50, "Tom", "06/23", "9876-8765-7654-6543");
		
		
		System.out.println(cp1.paymentDetails());
		System.out.println(cp2.paymentDetails());
		System.out.println(ccp1.paymentDetails());
		System.out.println(ccp2.paymentDetails());
	}

}
