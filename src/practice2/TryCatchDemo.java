package practice2;
import java.util.Scanner;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Please pass value other than 0");
			Scanner sc=new Scanner(System.in);
			double s=sc.nextDouble();
			System.out.println("Your answer is: "+10/s);
		}
		System.out.println("main end");
	}
}
