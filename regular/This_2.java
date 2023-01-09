package regular;

public class This_2 {
 void m1() {
	 System.out.println("im m1");
 }
 void m2() {
	 
	 this.m1();
	 System.out.println("im m2");
 }
	public static void main(String[] args) {
		// use to call the current class method
		This_2 b=new This_2();
		
		b.m2();
	}

}
