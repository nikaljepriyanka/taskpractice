package oct14;
class a1{
	void m1() {
		System.out.println("i am m1");
	}
}

public class inh extends a1{
void m2() {
	System.out.println("im m2");
}
	public static void main(String[] args) {
	inh p=new inh();
		p.m1();
		p.m2();
	}

}
