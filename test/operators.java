package test;

public class operators {

	public void a1 (int a, int b) {

		System.out.println(a+b);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int a=10;
       int b=20;
       int c=(a+b);  //c=30
       int d=(a+c);  //d=40
       int e=(b+c);  //e=50
	   int f=(d+b);  //f=60
	   int g=(e+b);  //g=70
	   int h=(a+c+d); //h=80
	   int i=(c+f);   //i=90
	   int j=(h+b);   //j=100
	
	System.out.println(c);
	System.out.println(d);
    System.out.println(e);
    
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    
    
    operators o=new operators();   //object created
    
    o.a1(10,20);    o.a1(20, 30);
    o.a1(10, 30);
    o.a1(20, 40);
    o.a1(40, 50);
    o.a1(50,60);
    o.a1(32, 44);
    o.a1(90, 30);
    o.a1(12, 44);
    o.a1(66, 14);
    o.a1(123, 234);
    
    
    
	
	}

}
