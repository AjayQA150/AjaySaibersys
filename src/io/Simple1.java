package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Simple1 {
public static void main(String[] args) throws Exception {
	FileInputStream fin1=new FileInputStream("f1.txt");
	FileInputStream fin2=new FileInputStream("f1.txt");
	FileOutputStream fout=new FileOutputStream("f3.txt");
	SequenceInputStream sis=new SequenceInputStream(fin1, fin2);
	int i=0;
while((i=sis.read())!=-1){
	fout.write(i);
}
sis.close();
fout.close();
fin1.close();
fin2.close();
	
}
}
