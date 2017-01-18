package objectandclass;

public class Singleton {
public static void main(String[] args) {
A a= A.getInstance();
	a.display();
}
}
class A{
	 static A a=new A();
	private A(){
		
	}
	public static A getInstance(){
		return a;
	}
	public void display(){
		System.out.println("This will be displayed");
	}
}
