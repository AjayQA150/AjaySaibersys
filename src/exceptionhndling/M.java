package exceptionhndling;

import java.io.IOException;

public class M {
void method() throws IOException{
	throw new IOException("device error");
}
public static void main(String[] args) {
	try{
	M m=new M();
	m.method();
	}catch(Exception e){
		System.out.println("Exception Handled");
	}
	System.out.println("Normal flow");
}
}
