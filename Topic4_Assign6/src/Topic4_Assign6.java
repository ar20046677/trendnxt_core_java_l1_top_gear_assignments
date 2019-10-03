
public class Topic4_Assign6 {
	public Topic4_Assign6() {
		new A1();
	}
	public static void main(String[] args) {
		A1 a = new A1();
		a = new A1();
		a = new A1();
		Runtime.getRuntime().gc();
	}


}
