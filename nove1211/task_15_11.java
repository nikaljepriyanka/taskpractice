package nove1211;

public class task_15_11 {

	final public static void main(String[] args) {
          String a="mummy";
          String b=" ";
          
          int s=a.length();
          
          for(int r=s-1;r>=0;r--) {
        	  
        	  b=b+a.charAt(r);
        	  
          }
		System.out.println(b);
	}

}
