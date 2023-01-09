package collection;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {
		//map store key value in a pair
		Map map=new HashMap();
		map.put("priya","jay");
		map.put(27, 14);
		map.put("cat","tom");
		map.put('g', 'y');
		
		System.out.println(map.get(27));
		System.out.println(map.get("tom"));   //null
		System.out.println(map.get("priya"));
		

	}

}
