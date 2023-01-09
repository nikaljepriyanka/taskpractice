package regular;

public class Reverse_sentence {

	public static void main(String[] args) {
		String a="this is mango tree";
		String b="";
		
		String [] c=a.split(" ");
		for(int t=c.length-1;t>=0;t--) {
			b=b+c[t]+" ";
		}
		System.out.println(b);
		}

	}


