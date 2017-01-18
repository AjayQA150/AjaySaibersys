package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Simple4 {
public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("abc.txt");
	int i=0;
	while((i=fr.read())!=-1){
		System.out.println((char)i);
		
	}
	fr.close();	
}
}
