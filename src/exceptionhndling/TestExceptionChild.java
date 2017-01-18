package exceptionhndling;
class Parent{
	void msg() throws Exception{
		System.out.println("parent");
	}
}
public class TestExceptionChild extends Parent {
void msg() throws Exception{
	System.out.println("TestException Child");
}
public static void main(String[] args) throws Exception {
	Parent p=new Parent();
	
	p.msg();
}

}
