package hashmap;

import java.util.HashMap;
import java.util.Set;

public class GetkeysandValues {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		Set<Integer> set=hashmap.keySet();
		System.out.println(set);
		System.out.println("Key " +"|"  +"Value");
		System.out.println("--------------------");
		for(Integer key:set){
			String value=hashmap.get(key);
			System.out.println(+key+  "|"  +value);
		}
	}

}
