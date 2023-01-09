package regular;
class b1{
	public void m1() {
		System.out.println("m1");
	}
}
public class Super_2 extends b1 {
	public void m2() {
		
		super.m1();
		System.out.println("m2");
	}

	public static void main(String[] args) {
		// use to call the parent class method
		
		Super_2 j=new Super_2();
		
		j.m2();
	}

}
