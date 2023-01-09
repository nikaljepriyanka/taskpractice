package practice;

public class fab {

	public static void main(String[] args) {
		int a=5;
		int b=6;
        int c;
        
        System.out.println(a);
        System.out.println(b);
        
        for(int d=1;d<=10;d++) {
        c=a+b;
        
        System.out.println(c);
        a=b;
        b=c;
        
	}
	}

}
