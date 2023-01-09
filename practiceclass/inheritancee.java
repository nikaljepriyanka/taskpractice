package practiceclass;

 class parent{
	public static void m1() {
		System.out.println("its m1");
	}
	
}
 class child extends parent{
	 public static void m2() {
		 System.out.println("m2 is");
	 }
 }
public class inheritancee {

	public static void main(String[] args) {
		child c=new child();
		c.m1();

	}

}
