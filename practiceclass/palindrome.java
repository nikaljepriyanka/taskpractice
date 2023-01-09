package practiceclass;

public class palindrome {

	public static void main(String[] args) {
		int a=168;
		int b=a;
		int rem;
		int rev=0;
		
		while(b!=0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		if(rev==a) {
			System.out.println("this is p");
			
		}
		else {
			System.out.println("this isnt");
		}

	}

}
