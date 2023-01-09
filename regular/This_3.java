package regular;

public class This_3 {
	This_3(int a){
		System.out.println("good afternoon");
	
	}
	
	This_3(){
		this(109);
		System.out.println("good night");
		
	}

	public static void main(String[] args) {
		// use to invoke current class constructor
		This_3 d=new This_3();
	}

}
