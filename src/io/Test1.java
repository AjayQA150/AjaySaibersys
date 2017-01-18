package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test1 {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("f1.txt");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String s="Sachin is my favourite playerssssss";
	byte b[]=s.getBytes();
	bout.write(b);
	bout.flush();
	bout.close();
	fout.close();
	System.out.println("Success");
}
}
