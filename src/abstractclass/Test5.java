package abstractclass;
//creating interface that has 4 methods
interface A{
	void a();//by default public and abstract 
	void b();
	void c();
	void d();
}
abstract class B  implements A{
	public void c(){
		System.out.println("This is C");
	}
}
class M extends B{
public void a(){
	System.out.println("This is A");
}
public void b(){System.out.println("This is B");}
public void d(){System.out.println("This is D");
}
}
 class Test5 {
public static void main(String[] args) {
	A a =new M();
a.a();
a.b();
a.c();
a.d();
}
}


