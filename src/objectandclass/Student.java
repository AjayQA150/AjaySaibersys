package objectandclass;

public class Student {
int id;//datamember
String name;
void insertrecord(int i,String n){
	id=i;
	name=n;
	
}
void displayinfo(){
	System.out.println("id is  " +id+   "   name is " + name);
}
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	s1.insertrecord(111, "Karan");
	s2.insertrecord(222, "charan");
	s1.displayinfo();
	s2.displayinfo();
}
}
