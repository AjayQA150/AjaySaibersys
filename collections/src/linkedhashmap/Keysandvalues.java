package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Keysandvalues {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
	Set<Integer> set=	linkedhashmap.keySet();
	System.out.println("Set :" +set);
	for( Integer key:set){
		String value=linkedhashmap.get(key);
		System.out.println(key+ "|" +value);
		
	}
	}

}
