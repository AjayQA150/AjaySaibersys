package abstractclass;

public class test {
int data=50;//
static int i=100;
void method(){
	int a=10;//local variables
	System.out.println(a);
}
void method2(){
	System.out.println("test method");
}
public static void main(String[] args) {
	System.out.println(test.i);
	//classname objectname=new classname
	test t=new test();
	t.method();
	t.method2();
	

}
	
	
}
