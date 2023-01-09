package regular;

public class Prime_num {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		for(int k=1;k<=a;k++) {
			if(a%k==0) {
			b++;
			}
		}
			if(b==2){
			System.out.println("prime no.");
			}
			else {
				System.out.println("not prime no.");
			}
		
	}

}
