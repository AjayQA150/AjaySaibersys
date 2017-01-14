package linkedhashmap;

import java.util.LinkedHashMap;

public class Containskeymethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
		boolean iskeyexist=linkedhashmap.containsKey(1);
		System.out.println("isKeyexists for 1 :" +iskeyexist);
		iskeyexist=linkedhashmap.containsKey(10);
		System.out.println("isKeyexists for 10 :" +iskeyexist);

	}

}
