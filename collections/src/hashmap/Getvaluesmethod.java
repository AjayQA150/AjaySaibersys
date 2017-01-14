package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Getvaluesmethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Apple");
		hashmap.put(2, "Ball");
		hashmap.put(3, "Cat");
		System.out.println("Hashmap Contains " +hashmap);
		Collection<String> collection =hashmap.values();
		System.out.println("values are " +collection+"\n");
		for(Iterator<String> itr=collection.iterator();itr.hasNext();){
			String value=itr.next();
			System.out.println(value);
			
		}
		
	}

}
