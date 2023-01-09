package practice;

public class a2 {

	public void m1() {
		System.out.println("i am happy");
		
	}
	public void m2() {
		this.m1();
		System.out.println("i am sad");
	}
	public static void main(String[] args) {
		a2 m2=new a2();
		
		m2.m2();
		
		
	}

}
