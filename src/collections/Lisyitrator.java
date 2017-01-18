package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lisyitrator {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Ajay");
	al.add("Sai");
	al.add("venkat");
	al.add(1, "Sachin");
	System.out.println("element at 2nd position " +al.get(2));
	ListIterator itr=al.listIterator();
	System.out.println("iterating elements forward");
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("iterating elements backward");
	while(itr.hasPrevious()){
		System.out.println(itr.previous());
	}
	
}
}
