package collections;

import java.util.Hashtable;
import java.util.Map;

public class TestCollection16 {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
	ht.put(101, "Amit");
	ht.put(101, "Rajesh");
	ht.put(102, "Rahul");
	ht.put(104, "Ajay");
	ht.put(105, "Rahul");
	for(Map.Entry m:ht.entrySet()){
		System.out.println("Key :" +m.getKey()+" Value : "+m.getValue());
	}
}
}
