package practice2;

public class App {
	
	public static void printSalary(Employee e) {
		System.out.println(e.getSalary());
	}

	public static void main(String[] args) {
		Employee m=new Manager();
		//System.out.println("Manager salary is: "+m.getSalary());
		printSalary(m);
		
		
		Employee c=new Clerk();
		//System.out.println("Clerk salary is: "+c.getSalary());
		printSalary(c);
	}

}
