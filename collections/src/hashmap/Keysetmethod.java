package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Keysetmethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		Set<Integer> set=hashmap.keySet();
		System.out.println("set "+set+ "\n");
		for(Integer key:set){
			System.out.println(+key);
		}
		
	}
	

}
