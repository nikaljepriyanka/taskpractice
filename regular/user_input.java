package regular;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		System.out.println("good one");
	Scanner n=new Scanner(System.in);
	
	int d=n.nextInt();
	
	while(d>=5) {
	if(d%2!=0) {
		System.out.println(d);
		
	} 
	d--;
	}
	
	
	}

}
