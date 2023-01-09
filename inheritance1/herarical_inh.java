package inheritance1;
class p1{
	void m1() {
		System.out.println("IS M1");
	}
}
class p2 extends p1{
	void m2() {
		System.out.println("is m2");
	}
}
class p3 extends p1{
	void m3() {
		System.out.println("is m3");
	}
}

class p4 extends p1{
	void m4() {
		System.out.println("is m4");
	}
}



public class herarical_inh {

	public static void main(String[] args) {
		p2 c=new p2();
		p3 c1=new p3();
		p4 c3=new p4();
       c.m1();
       c.m2();
       
       
	}

}
