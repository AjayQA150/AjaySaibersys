package collections;

import java.util.ArrayList;

//iterating using for each loop
public class TestCollection2 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList();
			al.add("Peter");
	al.add("Jacksoon");
	al.add("harry");
	for( String obj:al){
		System.out.println(obj);
	}
}
}
