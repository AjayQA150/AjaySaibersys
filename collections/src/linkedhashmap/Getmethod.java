package linkedhashmap;

import java.util.LinkedHashMap;

public class Getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
		String value=linkedhashmap.get(1);
		System.out.println("The value at key '1' is " +value );
		String value1=linkedhashmap.get(10);
		System.out.println("The value at key '1' is " +value1 );

	}

}
