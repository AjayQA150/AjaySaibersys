package linkedhashmap;

import java.util.LinkedHashMap;

public class Removemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
		String value=linkedhashmap.remove(1);
		System.out.println("value : " +value );
		System.out.println("Linkedhashmap :" +linkedhashmap);

	}

}
