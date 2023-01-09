package practice;

public class a1 {

	public static void main(String[] args) {
		String a="surekha";
		String b="";
		
		int i=a.length();
		
		for(int c=i-1;c>=0;c--) {
		
		b=b+a.charAt(c);

		}
		System.out.println(b);
		}
}