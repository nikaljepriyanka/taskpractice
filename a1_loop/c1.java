package a1_loop;

public class c1 {
 public void m1() {
	 System.out.println("i am m1");
 }
 public void m2() {
	 this.m1();
	 
	 System.out.println("i am m2");
 }
	public static void main(String[] args) {
		//"this" use for call current class method
		c1 c1=new c1();
		c1.m2();
	}

}
