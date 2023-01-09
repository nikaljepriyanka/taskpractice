package regular;

public class Overloading {
	
	public void m1(int a) {
		System.out.println("it is easy");
	}
    
	public void m1() {
		System.out.println("it is hard");
	}
	public static void main(String[] args) {
		Overloading c=new Overloading();
		
		c.m1(2);

		
	}

}
