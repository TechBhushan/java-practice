package practice2;

public class ExceptionChaining {
	public void m1() throws ClassNotFoundException{
		
	}
}

class B extends ExceptionChaining{
	
	public void m1(){
		System.out.println("Hi");
		int i=10;
		try {
		Thread.sleep(500);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);  //ClassNotFoundException does not have exception parameter constructor
											//then use RuntimeException class
		}
	}
}

class Test1{
	public static void main(String[] args) {
	try{
		ExceptionChaining b=new B();
		b.m1();
	}catch(ClassNotFoundException e) {
		
	}
	}
}
