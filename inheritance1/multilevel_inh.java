package inheritance1;
class b1{
	void m1() {
		System.out.println("my name m1");
	}
}
class b2 extends b1{                   //m1,m2
	void m2() {
		System.out.println("my name m2");
	}
}

class b3 extends b2{                   //m3,m1,m2
	void m3() {
		System.out.println("my name m3");
	}
} 




public class multilevel_inh {

	public static void main(String[] args) {
		b2 a=new b2();
		b3 a1=new b3();
		b1 a3=new b1();
		
	  a.m1();
	  a1.m3();
	  a.m2();
	  
		
	}

}
