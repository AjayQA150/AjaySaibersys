package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {
public static void main(String[] args) {
	ArrayList<Student1> al=new ArrayList<Student1>();
	al.add(new Student1(100,"Ajay",23));
	al.add(new Student1(105,"Vijay",25));
	al.add(new Student1(102,"Raju",24));
	Collections.sort(al);
	for(Student1 st:al){
		System.out.println("Roll no : " +st.rollno +" Name :"+st.name +"Age :" +st.age);
	}

}
}
