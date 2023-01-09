package regular;

public class This_1 {
  int a;
  
  public void m1(int a) {     //30
	  
	 this.a=5;
	  
  }
	public static void main(String[] args) {
		//this keywords is refer to current class instance variable
		
		This_1 n=new This_1();
		
		n.m1(30);
		
	}

}
