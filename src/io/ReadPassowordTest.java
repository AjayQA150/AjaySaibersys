package io;

import java.io.Console;

public class ReadPassowordTest {
public static void main(String[] args) {
	Console c=System.console();
	System.out.println("Enter password :");
	char ch[]=c.readPassword();
	String Pass=String.valueOf(ch);
	System.out.println("Password is " +Pass);
}
}
