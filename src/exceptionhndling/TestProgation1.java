package exceptionhndling;

public class TestProgation1 {
void m(){
	int a=25/0;
}
void n(){
	m();
}
void p(){
	try{
	n();
	}catch(Exception e){
		System.out.println("Exception handled");
	}
	
}
public static void main(String[] args) {
	TestProgation1 t=new TestProgation1();
	t.p();
}
}
