package io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("mfile.txt");
PrintStream pout=new PrintStream(fout);
pout.println("Hello java");
pout.println("Welcome to java");
pout.close();
fout.close();
}
}
