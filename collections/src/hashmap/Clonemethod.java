package hashmap;

import java.util.HashMap;

public class Clonemethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		Object object=hashmap.clone();
		System.out.println(object.getClass().getName());
		System.out.println("Hashmap after cloning  " +object);
	}

}
