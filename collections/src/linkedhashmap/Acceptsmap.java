package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Acceptsmap {

	public static void main(String[] args) {
TreeMap<Integer, String> treemap=new TreeMap<Integer,String>();
treemap.put(1, "Apple");
treemap.put(3, "Cat");
treemap.put(2 , "Ball");
System.out.println("Tree map : " +treemap);
LinkedHashMap<Integer,String> linkedhashmap=new LinkedHashMap<Integer,String>(treemap);
System.out.println("linnnkedhashmap :"  +linkedhashmap);


	}

}
