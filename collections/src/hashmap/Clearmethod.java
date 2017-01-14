package hashmap;

import java.util.HashMap;

public class Clearmethod {

	public static void main(String[] args) {
HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
hashmap.put(1, "Apple");
hashmap.put(2, "Ball");
hashmap.put(3, "Cat");
System.out.println("Values in Hashmap are  "  +hashmap);
hashmap.clear();
System.out.println("Values in the hashmap after using clear method  " +hashmap);

	}

}
