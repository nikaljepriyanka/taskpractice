package regular;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList h=new ArrayList();
		
		//we can handle by index
		//duplicate values are allowed
		
		h.add(20);
		h.add(40);
		h.add(22);
		h.add(20);
		h.add("my");
		h.add(20);
		
		System.out.println(h);
		System.out.println(h.get(2));
		h.remove(3);
		System.out.println(h);
		h.clear();
		System.out.println(h);
	}

}
