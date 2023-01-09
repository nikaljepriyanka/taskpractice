package test;

public class w2 {

	public static void main(String[] args) {
		int i=8;
		int v=0;
		
     for(int a=1;a<=i;a++) {
    	 if(i%a==0) {
    		 v++;
    	 }	 
    	 }
    	 if(v==2) {
    		 System.out.println("prime");
    	 }
    	 else {
    		 System.out.println("not prime");
    	 }
     }
	}


