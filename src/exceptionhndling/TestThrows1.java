package exceptionhndling;

import java.io.IOException;

public class TestThrows1 {
	void m() throws IOException{
			throw new IOException("Sorry Device error");
		
	}
	void n() throws IOException{
		m();
	}
	void p() throws IOException{
		try{
			n();
	}catch(Exception e){
			System.out.println("Exception handled");
		}
	}
public static void main(String[] args) throws IOException {
	TestThrows1 tt1=new TestThrows1();
	tt1.p();
	System.out.println("Normal Flow");
}
}
