package collections;

import java.util.HashMap;
import java.util.Map;

public class TestCollection14 {
public static void main(String[] args) {
	HashMap<Integer, String> hs=new HashMap<Integer,String>();
	hs.put(111, "Ajay");
	hs.put(222, "Vijay");
	hs.put(333, "Arun");
	for(Map.Entry m:hs.entrySet()){
		System.out.println(m.getKey()+"" +m.getValue());
	}
}
}
