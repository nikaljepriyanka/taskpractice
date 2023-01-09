package regular;
interface a12{
	void m1();        //by default its abstract method
	int d=20;
	
	 //java 8th version
	
	default void m2() {
		System.out.println("its u");
	}
	
	default void m3() {
	System.out.println("this is that");
	}
	
	//java 9th version
	
	default void m4() {
		System.out.println("good.E");
		
}
}
public class interface_abst implements a12{
	
	public void m1() {
		System.out.println("u r the ");
	}

	public static void main(String[] args) {
		interface_abst n=new interface_abst();
		
		n.m4();
		
    
	}

}
