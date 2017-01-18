package instanceofk;
interface Printable{
	
}

class A implements Printable{
	void getA(){
		System.out.println("this is method class A");
	}
}

class B implements Printable{
	void getB(){
		System.out.println("this is method from class B");
	}
}
class Call{
	void invoke(Printable p){//upcasting
		if(p instanceof A){
			A a=(A)p;//Downcasting
		a.getA();
		}
		if(p instanceof B){
			B b=(B)p;//Downcasting
			b.getB();
		}
		
	}
}

public class Test {
	public static void main(String[] args) {
	Printable p=new B();
Call c=new Call();
c.invoke(p);
	}
}
