package oct14;

public class incaps {

private int rollno;  // data hiding 

public void setrollno(int rollno) {
	
	this.rollno=rollno;
}
public int getrollno() {
	return rollno;
}
	public static void main(String[] args) {
		
		incaps a=new incaps();
		
		a.setrollno(101);
		
		System.out.println(a.getrollno());
		
		
		
	}

}
