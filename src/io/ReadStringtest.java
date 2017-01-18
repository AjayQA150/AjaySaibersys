package io;

import java.io.*;

 class ReadStringtest {
public static void main(String[] args) {
	Console c1=System.console();
	System.out.println("Enter your name :");
	String n1=c1.readLine();
	System.out.println("Welcome " +n1);
}
}
