package inheritance1;

class a1{
	void m1() {
		System.out.println("i am m1");
	}
	
}
class a2 extends a1{
	
	void m2() {
		System.out.println("i am m2");
	}
}




public class single_inh {

	public static void main(String[] args) {
		a2 a=new a2();
        
		a.m1();
		a.m2();
	}

}
