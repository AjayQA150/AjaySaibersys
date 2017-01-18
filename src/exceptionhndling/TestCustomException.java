package exceptionhndling;


class InvalidageException extends Exception{
	InvalidageException(String s){
		super(s);
	}
}
 class TestCustomException {
static void validate(int age) throws InvalidageException{
	if(age<18){
		throw new InvalidageException("Not valid");
	}
	else{
		System.out.println("Welcome to Vote");
	}
	
}
public static void main(String[] args) {
	try{
	validate(13);
	}catch(Exception m){
		System.out.println("Exception occoured " +m);
	}
System.out.println("rest of the code");
}
}
