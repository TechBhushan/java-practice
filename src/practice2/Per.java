package practice2;

class Person {
	String name;
}

class Student extends Person {
	String course;
}

class Faculty extends Person {
	String dept;
}

class Admin extends Person {
	String block;
}

public class Per {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Student();
		Object o = new Student();

		System.out.println(s.course);
		System.out.println(s.name);

		System.out.println(p.name);
//		System.out.println(p.course);
//		
//		System.out.println(o.course);
//		System.out.println(o.name);
	}
}