package abstractclass;

abstract class Shape{
	abstract void draw();
}
//In real scenario,implementation is provided by othersi.e unknown by end user
class Rectangle extends Shape{
	void draw(){
		System.out.println("Rectangle is drawn");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Circle is drawn");
	}
}
//in real scenario method is called by programmer or end user
public class TestAbstraction1 {
public static void main(String[] args) {
	Shape s=new Circle();//In real scenario,object is provided through method e.g getShape() method 
	s.draw();
}
}
