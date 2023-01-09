package nove1211;
class v1{
	int a;
}
public class p1 extends v1 {
	public void m1(int a) {
	System.out.println("i am sorry");
	super.a=a;
		
	}
	
	public static void main(String[] args) {
		p1 p1=new p1();
		p1.m1(20);

	}

}
