package io;

import java.io.FileWriter;

//File writer class
public class SimpleRead2 {
public static void main(String[] args) throws Exception {
	FileWriter fw=new FileWriter("abc.txt");
	fw.write("my name is sachin");
	fw.close();
}
}
