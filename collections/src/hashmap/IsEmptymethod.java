package hashmap;

import java.util.HashMap;

public class IsEmptymethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		boolean isempty=hashmap.isEmpty();
		System.out.println("Is Hashmap empty  "  +isempty);
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		isempty=hashmap.isEmpty();
		System.out.println("Is HashMap empty " +isempty);
	}

}
