package task;

public class a1411 {

	public static void main(String[] args) {
		
		// trim
		
		String a="hello";
		
		String b=" hello";
		
	System.out.println(b.trim());
	
	System.out.println(a);
		
		
	//replace
	
	String c="som";
	
	String d=c.replace('s','t');
	
	System.out.println(d);
	
	//tostartswith
	
	String i="shinchan";
	
	System.out.println(i.startsWith("sh")); //true
	
	System.out.println(i.endsWith("anw")); //false
	
	
	// toUpperCase
	
	String n="jAy";
	
	System.out.println(n.toUpperCase());
	System.out.println(n.toUpperCase());
	
  // split
	
	String o="hi@my@name@is@priya";
	
  String[] p=n.split("@");
  
  String b1=p[0];
  String b2=p[1];
  String b3=p[2];
  String b4=p[3];
  String b5=p[4];
  
  System.out.println(b2+" "+b3+" "+b4+" "+b5);
  
  
  
  
  
  
	}

}
