package regular;

public class Palindrome_num {

	public static void main(String[] args) {
		//P.N.-121,131,1441,434,12321
		
		int a=121; 
		int b=a;
		int rem;
		int rev=0;   //141       
		
		while(b!=0) {
			
			rem=b%10;   //1
			rev=rev*10+rem;     //14*10+1  //140+1  //141
			b=b/10;  //1
			
		}
		if(rev==a) {
			
			System.out.println("given no. is palindrome");
		}
		else {
			System.out.println("this is not a palindrame");
		}
	}

}
