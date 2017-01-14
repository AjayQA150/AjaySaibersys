package linkedhashmap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Valuesmethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
		linkedhashmap.put(1, "Apple");
		linkedhashmap.put(3, "Ball");
		linkedhashmap.put(2, "Cat");
		System.out.println("Linkedhashmap :" +linkedhashmap);
Collection<String> valueset=linkedhashmap.values();
System.out.println("collection : " +valueset);
for(Iterator<String> iterator=valueset.iterator();iterator.hasNext();){
	String values=iterator.next();
	System.out.println( values);
}
	}

}
