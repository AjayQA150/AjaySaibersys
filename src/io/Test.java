package io;

import java.io.FileOutputStream;

//writing into a file
public class Test {
public static void main(String[] args) {
	try {
		FileOutputStream fout= new FileOutputStream("abc.txt");
		String s="My favourite player is Sachin";
		byte b[]=s.getBytes();//converting String into byte array
		fout.write(b);
		fout.close();
		System.out.println("Success....");
		
		
	} catch (Exception e) {
System.out.println(e);	}
	
	
}
}
