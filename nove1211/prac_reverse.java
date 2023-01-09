package nove1211;

public class prac_reverse {

	public static void main(String[] args) {
		String a="ajay";
		String b=" ";  //yaja
		
		int c=a.length();
		for(int r=c-1;r>=0;r--) {
			
			b=b+a.charAt(r);
		}
		
		System.out.println(b);
	}

}