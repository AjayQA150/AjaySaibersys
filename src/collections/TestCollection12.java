package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestCollection12 {
public static void main(String[] args) {
	PriorityQueue<String> p=new PriorityQueue<String>();
	p.add("Amit");
	p.add("Vijay");
	p.add("Karan");
	p.add("jai");
	p.add("Rahul");
	System.out.println("head :" +p.element());
	System.out.println("head :" +p.peek());
	System.out.println("iterating the queue elements");
	Iterator itr=p.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	p.remove();
	p.poll();
	System.out.println("after removing two elements");
	Iterator itr2=p.iterator();
	while(itr2.hasNext()){
		System.out.println(itr2.next());
	}
}
}
