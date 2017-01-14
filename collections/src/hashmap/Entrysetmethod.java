package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Entrysetmethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
	Set<Map.Entry<Integer, String>>	entryset=hashmap.entrySet();
	System.out.println("entry set :" +entryset );
	System.out.println("Key  " +"|" + "Value");
	System.out.println("---------------------");
	for(Map.Entry<Integer, String>   entry:entryset){
		System.out.println(entry.getKey() +"|"+entry.getValue());
	}
	}

}
