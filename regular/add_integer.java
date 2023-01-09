package regular;

public class add_integer {
   int a=10;
   int b=30;
   
   String c="multiple by";
   
   void m1() {
	   
	   int d=b*a;
	   System.out.println(d);
   }
   
	public static void main(String[] args) {
		add_integer n=new add_integer();
		
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.c);
		n.m1();
        
	}

}
