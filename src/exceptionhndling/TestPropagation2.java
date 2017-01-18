package exceptionhndling;

import java.io.IOException;

public class TestPropagation2 {
void m() throws IOException{
	throw new IOException("device error");
}
void n() throws IOException{
	m();
}
void p() throws IOException{
	n();
}
public static void main(String[] args) throws IOException {
	TestPropagation2 t2=new TestPropagation2();
	t2.p();
	System.out.println("flow continues");
}
}
