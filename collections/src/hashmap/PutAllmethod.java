package hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class PutAllmethod {

	public static void main(String[] args) {
TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
treemap.put(1, "Apple");
treemap.put(3, "CAt");
treemap.put(2, "Ball");
System.out.println("Values in treemap are  " +treemap );
HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
hashmap.putAll(treemap);
System.out.println("Hashmap values are " +hashmap);


	}

}
