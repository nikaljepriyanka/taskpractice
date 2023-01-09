package condstatement;

public class nestedif {

	public static void main(String[] args) {
		// nested if
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b) {
			System.out.println("a is less than b");
			if(a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("a is less than c");
		}
	
	}	 
		else {
			System.out.println("c is greater than b");
		}
	}
		
}