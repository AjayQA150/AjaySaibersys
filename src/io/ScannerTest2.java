package io;

import java.util.Scanner;

public class ScannerTest2 {
public static void main(String[] args) {
	String input="10 tea 20 cfee 30 teabiscuits";
	Scanner s= new Scanner(input).useDelimiter("\\s");
	System.out.println(s.nextInt());
	System.out.println(s.next());
	System.out.println(s.nextInt());
	System.out.println(s.next());
s.close();
}
}
