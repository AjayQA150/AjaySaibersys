package hashmap;

import java.util.HashMap;

public class Removemethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		String value=hashmap.remove(2);
		System.out.println("value: "+value);
		System.out.println("Hashmap contains " +hashmap);
	}

}
