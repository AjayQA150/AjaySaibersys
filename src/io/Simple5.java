package io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class Simple5 {
public static void main(String[] args) throws Exception {
	CharArrayWriter cout=new CharArrayWriter();
	cout.write("my name is");
	FileWriter f1out=new FileWriter("a.txt");
	FileWriter f2out=new FileWriter("b.txt");
	FileWriter f3out=new FileWriter("c.txt");
	FileWriter f4out=new FileWriter("d.txt");
	cout.writeTo(f1out);
	cout.writeTo(f2out);
	cout.writeTo(f3out);
	cout.writeTo(f4out);
	f1out.close();
	f2out.close();
	f3out.close();
	f4out.close();
}
}
