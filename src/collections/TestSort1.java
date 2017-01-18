package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
public static void main(String[] args) {
	ArrayList<String>  al=new ArrayList<String>();
	al.add("varun");
	al.add("Saurav");
	al.add("Mukesh");
	al.add("Tahir");
	Collections.sort(al);
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());;
	}

}
}
