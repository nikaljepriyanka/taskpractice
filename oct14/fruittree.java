package oct14;
abstract class fruit{
	abstract void taste();
}
class apple extends fruit{
	void taste() {
		System.out.println("i am sweet");
	}
}
class banana extends fruit{
	void taste() {
		System.out.println("i am god");
	}
}

class black_berry extends fruit{
	void taste() {
		System.out.println("i am saur");
	}
	}

public class fruittree {

	public static void main(String[] args) {
	 apple b=new apple();
	banana s=new banana();
	black_berry t=new black_berry();
	 
	 b.taste();
	 s.taste();
	 t.taste();
	 
	}

}
