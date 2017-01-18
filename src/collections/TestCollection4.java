package collections;

import java.util.ArrayList;

public class TestCollection4 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Steve");
	al.add("john");
	al.add("doe");
ArrayList<String> al2=new ArrayList<String>();
al2.add("Steve");
al2.add("Mehtha");
//al.addAll(al2);
//al.removeAll(al2);
al.retainAll(al2);
System.out.println("iterating after removal of elements from al2");
for( String obj:al){
	System.out.println(obj);
}

}
}
