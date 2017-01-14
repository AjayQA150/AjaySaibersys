package linkedhashmap;

public class Employee {
private int age;
private String name;
private int salary;
Employee(int age,String name,int salary){
	super();
	this.age=age;
	this.name=name;
	this.salary=salary;
	}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String toString(){
	return " Employee [name= " +name+" ,age= " +age+",salary = " +salary+"]";
}
}
