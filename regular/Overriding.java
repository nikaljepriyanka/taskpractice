package regular;
class u1{
	
	public void c1() {
		System.out.println("gold");
	}
	
}
public class Overriding extends u1 {
	public void c1() {
		System.out.println("silver");
	}

	public static void main(String[] args) {
		
		Overriding p=new Overriding();
		
	
		p.c1();

	}

}
