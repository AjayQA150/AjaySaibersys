package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Simpleread1 {
public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("f1.txt");
	BufferedInputStream bin=new BufferedInputStream(fin);
	int i=0;
	while((i=bin.read())!=-1){
		System.out.println((char)i);
	}
	bin.close();
	fin.close();
	
}
}
