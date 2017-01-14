package linkedhashmap;

import java.util.LinkedHashMap;

public class IsEmptymethod {

	public static void main(String[] args) {
LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer,String>();
boolean isitempty=linkedhashmap.isEmpty();
System.out.println("Is it empty ? " +isitempty);
linkedhashmap.put(1, "Apple");
linkedhashmap.put(3, "Ball");
linkedhashmap.put(2, "Cat");
 isitempty=linkedhashmap.isEmpty();
 System.out.println("Is it empty ? " +isitempty+linkedhashmap);

	}

}
