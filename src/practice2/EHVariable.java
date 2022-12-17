package practice2;

public class EHVariable {

	public static void main(String[] args) {
		int a; //initialized with value 10 from try block
		try {
			a=10;
			System.out.println("In try a: "+a);
		}catch(ArithmeticException e) {
			//System.out.println("In catch a: "+a);  //Local variable cannot be initialized
		}
		//System.out.println("After try/catch: "+a);	//Local variable cannot be initialized

	}

}
