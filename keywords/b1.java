package keywords;

public class b1 {
int a;
public void m1(int a) {    //a=10
	this.a=a;   
}
	public static void main(String[] args) {
//this keywords refer to current class instant variable
   b1 a=new b1();
   
   a.m1(10);
	}

}
