package regular;

public class exception_handle {

	public static void main(String[] args) {
		// we can use try,catch,finally block
	try {	
		int a=10;
		int b=0;
		int c;
		c=a/b;
		
		System.out.println(c);   }
	catch(ArithmeticException u) {
		System.out.println(u);
	}
	finally {
		System.out.println("succeed");
	}
	
	}

}
