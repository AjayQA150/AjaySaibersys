package linkedhashmap;

import java.util.LinkedHashMap;

public class ContainsValueMethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);	
		boolean isvalueexist=linkedhashmap.containsValue("Cat");
		System.out.println("Is 'cat' exists " +isvalueexist);
		 isvalueexist=linkedhashmap.containsValue("Cats");
			System.out.println("Is 'cats' exists " +isvalueexist);
	 


}
}
