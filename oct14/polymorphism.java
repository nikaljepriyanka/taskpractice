package oct14;

public class polymorphism {

	public void m1(int w) {
		System.out.println("good night");
	}
	
	public void m1(char q) {
		System.out.println("good mrg");
		
	}
	
	
	public static void main(String[] args) {
		polymorphism u=new polymorphism();
		
		u.m1(12);
		u.m1('E');
		
	}

}
