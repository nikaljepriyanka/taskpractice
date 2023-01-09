package practice;

public class prime {

	public static void main(String[] args) {
		int a=6;
		int b=0;
		
		for(int c=1;c<=a;c++) {
			if(a%c==0) {
				b++;
			}	
				
			}
			if(b==2) {
			System.out.println("is prime");
		}
			else {
				System.out.println("not prime");
			}
		}
	}


