package regular;

public class largest_no {

	public static void main(String[] args) {
		int a=500;
		int b=800;
		int c=700;
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
				
			}
			else {
				System.out.println(c);
			}
		}
		
	}

}
