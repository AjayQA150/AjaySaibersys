package inheritance;
//create a class and implement an interface
interface printable{
	void print();
}
interface showable extends printable{
	void show();
}
 class A implements printable,showable{
	public void print(){
		System.out.println("printing...");
	}
	public void show(){
		System.out.println("showing....");
	}
public static void main(String[] args) {
	showable a=new A();
	a.print();
	a.show();
}
}
