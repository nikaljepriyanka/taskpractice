package oct14;
interface s1 {
	 default void c1() {
		System.out.println("im c1");
	
}
interface a2 {
	 default void c2() {
		System.out.println("im c2");
	}
}

public class interf implements s1,a2 {

	public static void main(String[] args) {
		s1 p=new interf();
		a2 p1=new interf();
		
		
		p1.c2();

	}
}
}
