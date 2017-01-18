package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class B {
public static void main(String[] args) throws Exception {
	//creating fileinputstream objects for all files
	FileInputStream fin=new FileInputStream("f1.txt");
	FileInputStream fin1=new FileInputStream("f2.txt");
	FileInputStream fin2=new FileInputStream("f3.txt");
	FileInputStream fin3=new FileInputStream("abc.txt");
	//Creating vector object to all the stream
	Vector v=new Vector();
	v.add(fin);
	v.add(fin1);
	v.add(fin2);
	v.add(fin3);
	//creating enumeration method by calling the elements object
	Enumeration e=v.elements();
	//passing  the enumeration object to a constructor
	SequenceInputStream bin=new SequenceInputStream(e);
	int i=0;
	while((i=bin.read())!=-1){
		System.out.println((char)i);
	}
	bin.close();
	fin.close();
	fin2.close();
	

}
}
