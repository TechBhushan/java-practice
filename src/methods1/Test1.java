package methods1;

interface Anon{
	void clash();
	void titans();
}

public class Test1 {
	public static void main(String[] args) {
		
		Anon t2=new Anon() {

			@Override
			public void clash() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void titans() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
