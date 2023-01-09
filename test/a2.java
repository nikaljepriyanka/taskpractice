package test;

public class a2 {

	
	int a=200;
	
    protected static String b="hello";	
	
   
    private void a2() {
    
          int a=10;
          char b='d';
          String c="hi";
    
    }
    
    
    
  
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	a2 o=new a2();	
		
		//to call non-static
		System.out.println(o.a);

	//to call static
	System.out.println(a2.b);
	
	
	}

}
