package exceptionhndling;

public class TestThrow {
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Age must be above 18");
		}
		else{
			System.out.println("Welcome to Vote");
		}
	}
public static void main(String[] args) {
	TestThrow.validate(13);
}
}
