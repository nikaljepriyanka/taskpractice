package practiceclass;

public class encapss {
	static String name;
	
	public void settername(String name) {
		this.name=name;
	}
	public String gettername() {
		return name;
		
	}

	public static void main(String[] args) {
		encapss e=new encapss();
		e.settername("priya");
		System.out.println(e.gettername());
	
	}

}
