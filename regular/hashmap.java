package regular;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		//we can store the value in key pairs
		
		HashMap t=new HashMap();
		
		t.put("name", "priya");
		t.put("bdate", "2707");
		t.put("city", "pune");
		t.put("drink", "coffie");
		t.put("shift", "morng");
		
		System.out.println(t.get("city"));
		t.remove("name");
		System.out.println(t.get("drink"));
		t.clear();
		System.out.println(t.get("shift"));
		
		
	}

}
