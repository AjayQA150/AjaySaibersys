package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {
public static void main(String[] args) {
	//creating user defined class objects
	Student s1=new Student(111,"Adam",25);
	Student s2=new Student(112,"david",25);
	Student s3=new Student(113,"Rob",25);
ArrayList<Student> al=new ArrayList<Student>();//creating arraylist
al.add(s1);//adding student class object
al.add(s2);
al.add(s3);

/*Iterator itr=al.iterator();
while(itr.hasNext()){
	Student st=(Student)itr.next();
	System.out.println(st.rollno+st.name+st.age);
}*/
for(Student s:al){
	System.out.println(s);
	//System.out.println(s.rollno+" " +s.name +s.age);
}
}
}
