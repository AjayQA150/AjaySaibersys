package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCollection7 {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("Ajay");
	ts.add("Vijay");
	ts.add("Ravi");
	ts.add("Ajay");
	Iterator itr=ts.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
