package linkedhashmap;

import java.util.LinkedHashMap;

public class Size {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lnkdhashmap=new LinkedHashMap<Integer,String>();
		lnkdhashmap.put(1, "Apple");
		lnkdhashmap.put(3, "Cat");
		lnkdhashmap.put(2, "Ball");
		System.out.println("Linkedhashmap " +lnkdhashmap);
		int size=lnkdhashmap.size();
		System.out.println("size " +size);
	}

}
