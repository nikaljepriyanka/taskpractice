package practiceclass;
class c1 {
	public void m1(String name) {
		System.out.println("m1.2");
	}	
}	
public class overlod extends c1 {
	
public void m1(String name) {
		System.out.println("m1");
	}

	

	public static void main(String[] args) {
		
		c1 o=new c1();
		o.m1("jay");
	
		
	}

}
