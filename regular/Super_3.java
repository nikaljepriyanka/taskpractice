package regular;
class n1{
	n1(int s){
		System.out.println("priya");
	}
}
public class Super_3 extends n1{
  Super_3(){
	  
	  super(5);
	  System.out.println("piu");
  }
	public static void main(String[] args) {
		// use to invoke the parent class constructor
		
		Super_3 k=new Super_3();
		
	}

}
