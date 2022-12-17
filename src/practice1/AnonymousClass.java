package practice1;

class Anon {
	public void anm() {
		System.out.println("Hello");
	}
}

class Anon1{
	Anon an=new Anon() {      //Anonymous Class
		public void anm() {
			System.out.println("Namaste");
		}
	};  			//Needed ; to close
}

public class AnonymousClass{
	public static void main(String[] args) {
		Anon1 an1=new Anon1();
		an1.an.anm();
	}
}
