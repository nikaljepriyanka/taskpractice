package regular;

public class Encapsulation {
   private int a;
   
   public void setempid(int empid) {
	   this.a=empid;
	   
   }
   public int getempid() {
	   return a;
   }
	public static void main(String[] args) {
		// we need declared variable as private
		// will use the getter & setter method for view & modify data
		//we have take return type which is set data type
		
		Encapsulation o=new Encapsulation();
		
		o.setempid(18);
		System.out.println(o.getempid());

	}

}
