package instanseblock;

class A{
	A(){
		System.out.println("parent class constructor is invoked");
	}
}
public class B2 extends A {
B2(){
	System.out.println("Child class constuctor is invoked" );
}
{
	System.out.println("Instance Initializer blck");
}
public static void main(String[] args) {
	B2 b=new B2();
}
}

