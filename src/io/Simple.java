package io;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Simple {
public static void main(String[] args) throws Exception {
	FileInputStream fin1=new FileInputStream("f1.txt");
	FileInputStream fin2=new FileInputStream("f2.txt");
	SequenceInputStream sis=new SequenceInputStream(fin1, fin2);
	int i=0;
	while((i=sis.read())!=-1){
		System.out.println((char)i);
	}
	sis.close();
	fin1.close();
	fin2.close();

}
}
