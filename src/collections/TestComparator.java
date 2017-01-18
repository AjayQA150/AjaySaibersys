package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
public static void main(String[] args) {
	Student2 s1=new Student2(100,"vijay",23);
	Student2 s2=new Student2(101,"ajay",27);
	Student2 s3=new Student2(102,"jai",21);

	ArrayList<Student2> list=new ArrayList<Student2>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
System.out.println("Sorting By age");
Collections.sort(list, new AgeComparator());
Iterator itr=list.iterator();

	while(itr.hasNext()){
		Student2 s=(Student2) itr.next();
		System.out.println(" Rollno:"+s.rollno+" Name :" +s.name+" Age :" +s.age);

}
System.out.println("Sorting By name");
Collections.sort(list, new NameComparator());
Iterator itr1=list.iterator();

while(itr1.hasNext()){
	Student2 s=(Student2) itr1.next();
	System.out.println("Rollno:"+s.rollno+"Name :" +s.name+"Age :" +s.age);

}
/*for(ArrayList<Student2> m:list){
	System.out.println();
}*/
	
	
}
}
