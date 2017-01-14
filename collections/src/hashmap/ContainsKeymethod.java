package hashmap;

import java.util.HashMap;

public class ContainsKeymethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		boolean iskeyexist=hashmap.containsKey(2);
		System.out.println("IskeyExists " +iskeyexist);
		iskeyexist=hashmap.containsKey(10);
		System.out.println("IskeyExists " +iskeyexist);
	}

}
