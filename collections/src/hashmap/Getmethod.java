package hashmap;

import java.util.HashMap;

public class Getmethod {
public static void main(String[] args) {
	HashMap<Integer, String> hashmap=new HashMap<Integer,String>();
	hashmap.put(1, "Apple");
	hashmap.put(2, "Ball");
	hashmap.put(3, "Cat");
	System.out.println("Hashmap Contains " +hashmap);
	String value=hashmap.get(2);
	System.out.println("The value at key 2 is " +value);
	String value1=hashmap.get(10);
	System.out.println("The value at key 10 is  "  +value1);
	
}
}
