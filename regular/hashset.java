package regular;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// we can not store duplicate value
		// can not handle by index
		
		HashSet g=new HashSet();
		
		g.add(10);
		g.add(44);
		g.add(55);
		g.add("mom");
		g.add(10);
		g.add('H');
		
		System.out.println(g);
		g.remove(10);
		System.out.println(g);
		System.out.println(g.contains(10));
		g.clear();
		System.out.println(g);
		
	}

}
