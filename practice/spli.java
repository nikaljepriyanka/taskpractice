package practice;

public class spli {

	public static void main(String[] args) {
		String a="priya";
		String b=" ";
		
		int c=a.length();
		for(int r=c-1;r>=0;r--) {
			
			b=b+a.charAt(r);
			
		}
			System.out.println(b);
		

	}

}
