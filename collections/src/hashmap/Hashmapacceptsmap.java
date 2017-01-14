package hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class Hashmapacceptsmap {

	public static void main(String[] args) {
TreeMap<Integer, String> treemap=new TreeMap<Integer,String>();
treemap.put(1, "Apple");
treemap.put(2, "Ball");
treemap.put(3, "cat");
System.out.println("TreeMap contains  "  +treemap);
HashMap<Integer,String> hashmap=new HashMap<Integer,String>(treemap);
System.out.println("HashMap accepted  TreeMap and the values are " +hashmap);

	}

}
