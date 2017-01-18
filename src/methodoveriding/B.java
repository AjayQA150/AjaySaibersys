package methodoveriding;
//method over-riding with c-variant return type
class A{
	A getA(){
		return this;
	}
}
public class B extends A {
	 B getA(){
		return this;
	}
	void msg(){
		System.out.println("Welcome to covariant return type");
	}
	public static void main(String[] args) {
		new B.getA().msg();
	}

}