package collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection5 {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<String>();
	h.add("Vijay");
	h.add("Ravi");
	h.add("Sachin");
	h.add("Ravi");
	Iterator itr=h.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
