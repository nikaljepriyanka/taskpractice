package test2;

public class demo_2 {
       
	//non-static and argument method
	
	public void m1(int a, char b) {     // a=10, b=5
	
	 System.out.println("i am method m1");
	
	
	int c=a;
	System.out.println(c);
	
	}
	//static and non-arguments
	static public void m2() {
	
		System.out.println("i am method m2 ");
	}
	
	int a=500;

	public static void main(String[] args) {
	
		demo_2 a=new demo_2();

		
		//non-static
		
		a.m1(10,'s');
		
		//static 
		a.m2();
		demo_2.m2();
	}

}
