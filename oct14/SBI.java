package oct14;

abstract class bank{
	abstract void ROI();

}
 class axis extends bank{
public void ROI() {
	System.out.println("ROI 7%");
}	 
	
}
public class SBI extends bank{
void ROI() {
	System.out.println("ROI is 10%");
}
	public static void main(String[] args) {
		axis a=new axis();
		SBI a1=new SBI();
		
		a.ROI();
		a1.ROI();
		
	}

}
