package practice;

public class reverse_sentense {

	public static void main(String[] args) {
		String a="i am priya";
		String b="";
		
		int l=a.length();
		for(int s=l-1;s>=0;s--) {
		b=b+a.charAt(s);
		

	}
		System.out.println(b);
	}
}
