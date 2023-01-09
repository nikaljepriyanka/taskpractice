package oct14;

public class encaps {
	private int bdate;
	
	public void setbdate(int bdate) {
		this.bdate=bdate;
	}
	public int getbdate() {
		return bdate;
	}
	
	public static void main(String[] args) {
	encaps g=new encaps();
	
	g.setbdate(2707);
		System.out.println(g.getbdate());
	}
}