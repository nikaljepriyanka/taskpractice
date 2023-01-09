package nove1211;

public class overloading {

	public void a3(String email,int pass) {
		System.out.println("navigate to home page");
	}
	public void a3(int pass, String firstname) {
	System.out.println("move on sign");
	}
	
	public static void main(String[] args) {
		overloading d=new overloading();
		
		d.a3("nikajepriyanka@027",180110);
		d.a3(12123, "priya");

	}

}
