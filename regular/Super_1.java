package regular;
class a1 {
	int a;
}
public class Super_1 extends a1 {
     public void m1(int a) {
    super.a=a;
    	 
     }
	public static void main(String[] args) {
		// super keyword refer to parent class instance variable

		Super_1 h=new Super_1();
		
		h.m1(9);
	}

}
