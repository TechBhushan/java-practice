package methods1;
class Employee{
	int sno;
	String sname;
	String dept;
	int sal;
}

class Company{
	void display(Employee e) {
		e.sno=7;
		e.sname="Am";
		e.dept="AI";
		e.sal=50000*12;
	}
	void annSal(Employee e) {
		System.out.println(e.sal*12);
	}
	void incrSal(Employee e, int perc) {
		e.sal= e.sal+(e.sal*perc)/100;
	}
}

public class TestCompany {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.sno=20;
		e1.sname="Ram";
		e1.dept="Sc";
		e1.sal=10000;
		
		Company c=new Company();
		
		c.annSal(e1);
		System.out.println();
		
		c.incrSal(e1, 100);  
		System.out.println(e1.sal);
	}

}
