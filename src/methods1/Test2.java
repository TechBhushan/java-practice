package methods1;

class Student1{
	int sno;
	String sname;
	String course;
	double fee;
}

class Collage{
	void m1(){
		Student1 s1=new Student1();
		s1.sno=5;
		s1.sname="Ram";
		s1.course="AI";
		s1.fee=90000;
	}
	
	Student1 m2() {
		Student1 s2=new Student1();
		s2.sno=7;
		s2.sname="Han";
		s2.course="AII";
		s2.fee=50000;
		
		return s2;
	}
}

class Test2{
	public static void main(String[] args) {
		Collage col=new Collage();
		col.m1();
		System.out.println(col.m2());
		
		Student1 s3=col.m2();     //method m2 value stored in s3 referenced variable of Student1 type
		
		System.out.println(s3.sno);
		System.out.println(s3.sname);
		System.out.println(s3.course);
		System.out.println(s3.fee);
		}
}