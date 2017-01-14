package hashmap;

import java.util.HashMap;

public class Hashmapsize {
	public static void main(String[] args) {
		
	
	HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
	hashmap.put(1, "Apple");
	hashmap.put(2, "Ball");
	hashmap.put(3, "Cat");
	System.out.println("Hashmap Contains " +hashmap);
	int size =hashmap.size();
	System.out.println("hashmap size " +size );
}
}
