package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5 {
public static void main(String[] args) throws Exception {
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(in);
	System.out.println("Enter your name :");
	String name=br.readLine();
	System.out.println("Welcome " +name);
}
}
