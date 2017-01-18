package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Adam");
	al.add("David");
	al.add("Steve");
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
