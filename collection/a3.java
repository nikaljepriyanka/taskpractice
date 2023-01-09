package collection;

import java.util.HashSet;
import java.util.Set;

public class a3 {

	public static void main(String[] args) {
		//not allow dublicate value
		//do not handle by index
		
		Set set=new HashSet();
		set.add(2);
		set.add(4);
		set.add("priya");
		set.add('A');
		set.add("priya");     //not getting dublicate value
		System.out.println(set);
		
		set.remove(4);
		System.out.println(set);
		System.out.println(set.contains(2));  //true
		System.out.println(set.isEmpty());    //false
		set.clear();
		System.out.println(set.isEmpty());   //true
	}

}
