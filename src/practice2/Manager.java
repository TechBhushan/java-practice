package practice2;

public class Manager extends Employee {
	
	@Override
	public int getSalary() {
		return sal + 50000;
	}
}
