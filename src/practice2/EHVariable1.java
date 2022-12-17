package practice2;

public class EHVariable1 {

	public static void main(String[] args) {
			int a;  //initialized with value 20 from catch block
			try {
				a=10/0;
				System.out.println("In try a: "+a);
			}catch(ArithmeticException e) {
				a=20;
				System.out.println("In catch a: "+a);  
			}
			System.out.println("After try/catch: "+a);

		}
}
