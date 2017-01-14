package linkedhashmap;

import java.util.LinkedHashMap;

public class Clonemethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
		Object object=linkedhashmap.clone();
		LinkedHashMap<Integer, String> clonedhashmap=(LinkedHashMap<Integer, String>)object;
		System.out.println(object.getClass().getName());
	System.out.println("hashmap after cloning is " +clonedhashmap);
	
	}

}
