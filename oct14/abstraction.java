package oct14;
abstract class b1{
	public void m1() {
		System.out.println("i am m1");
		
		
	}
	abstract void m2();
	
}
public class abstraction extends b1{
  public void m2() {
	  System.out.println("i am m2");
  }
	public static void main(String[] args) {
		
		abstraction v=new abstraction();
		
		v.m1();
		v.m2();
		
		
		
		
	}

}
