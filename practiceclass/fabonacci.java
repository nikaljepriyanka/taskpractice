package practiceclass;

public class fabonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int s=1;s<=12;s++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
