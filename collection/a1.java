package collection;

import java.util.ArrayList;
import java.util.List;

public class a1 {

	public static void main(String[] args) {
	
		 //allow dublicate values
		//we can handle by index
		
		List list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("jay");
		list.add('a');
		list.add(20);
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(2));
		
	}

}
