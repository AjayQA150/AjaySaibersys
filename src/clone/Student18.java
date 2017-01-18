package clone;

public class Student18 implements Cloneable   {
int rollno;
String name;
Student18(int rollno,String name){
	this.name=name;
	this.rollno=rollno;
}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}


public static void main(String[] args) throws Exception {
	Student18 s1=new Student18(10,"Ajay");
	Student18 s2=(Student18)s1.clone();
	System.out.println(s1.name +"  " +s1.rollno);
	System.out.println(s2.name +"  " +s2.rollno);
}
}
