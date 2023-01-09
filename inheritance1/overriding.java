package inheritance1;

class s1{
	public void n1() {
		System.out.println("this is okey");
	}
	
}
public class overriding extends s1 {
 public void n1() {
	 System.out.println("this is nice");
 }
	public static void main(String[] args) {
		overriding d=new overriding();
		
		d.n1();

	}

}
