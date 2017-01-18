package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestCollection6 {
public static void main(String[] args) {
	LinkedHashSet<String> ls=new LinkedHashSet<String>();
	ls.add("Ajay");
	ls.add("Sachin");
	ls.add("adam");
	ls.add("Sachin");
	Iterator  itr=ls.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
