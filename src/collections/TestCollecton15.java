package collections;

import java.util.Map;
import java.util.TreeMap;

public class TestCollecton15 {
public static void main(String[] args) {
	TreeMap<Integer,String> t=new TreeMap<Integer,String>();
	t.put(100, "Ajay");
	t.put(104, "Rahul");
	t.put(102, "Rohan");
	t.put(101, "Vijay");
	for(Map.Entry m:t.entrySet()){
		System.out.println("Key :  " +m.getKey() +"  Value :" +m.getValue());
	}
}
}
