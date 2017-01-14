package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmaponeKeyMultipleValues {

	public static void main(String[] args) {
HashMap<Integer, List<String>> hashmap=new HashMap<Integer,List<String>>();
List<String> Listone=new ArrayList<String>();
Listone.add("Apple");
Listone.add("Aeroplane");

List<String> listtwo=new ArrayList<String>();
listtwo.add("Bat");
listtwo.add("Ball");

List<String> listthree=new ArrayList<String>();
listthree.add("Cat");
listthree.add("Cotton");

hashmap.put(1, Listone);
hashmap.put(2, listtwo);
hashmap.put(3, listthree);
System.out.println("Hashmap contains " +hashmap +"\n");

for(Map.Entry<Integer, List<String>> entry:hashmap.entrySet()){
	int key=entry.getKey();
	List<String> list=entry.getValue();
	System.out.println(key + "|" +list);
}
	}

}
