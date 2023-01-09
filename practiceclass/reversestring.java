package practiceclass;

public class reversestring {

	public static void main(String[] args) {
		 String a="priya is good tech";
		 String b="";
		 
		 String [] c=a.split(" ");
		 int g=c.length;
		 for(int s=g-1;s>=0;s--) {
			 b=b+c[s]+" ";
			
		 }
		 System.out.println(b);
	}

}
