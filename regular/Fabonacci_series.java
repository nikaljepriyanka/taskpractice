package regular;

public class Fabonacci_series {

	public static void main(String[] args) {
//Fabonacci = Sum of first 2 nums thats next num.
		
		int a=5;
		int b=6;
		     
		     
		System.out.println(a);
		System.out.println(b);
		
		int c;
		
		for(int d=1;d<=10;d++) {           //a-1st num     // b-2nd num   //c-3rd num
			
			c=a+b;
			System.out.println(c);  //0,1))),1,2,3,5,8,13,21,34,55,89
			a=b;//1,1,2,
			b=c;//1,2,3,
		}
	}

}
