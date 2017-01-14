package linkedhashmap;

import java.util.LinkedHashMap;

public class Clearmethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lnkdhashmap=new LinkedHashMap<Integer,String>();
		lnkdhashmap.put(1, "Apple");
		lnkdhashmap.put(3, "Cat");
		lnkdhashmap.put(2, "Ball");
		System.out.println("Linkedhashmap " +lnkdhashmap);
		lnkdhashmap.clear();
		System.out.println("Linkedhashmap " +lnkdhashmap);

	}

}
