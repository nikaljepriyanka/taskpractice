package practice;

public class overl {

	public void m1(String pass) {
		System.out.println("i am m1");
	}
	public void m1(int mob, String pass) {
		System.out.println("i am m1copy");
	}
	
	
	
	
	public static void main(String[] args) {
		overl v=new overl(); 
		v.m1("123");
		v.m1(987,"pri@123");
	}

}
