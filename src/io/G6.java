package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class G6 {
public static void main(String[] args) throws Exception {
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(in);
	String name ="";
	while(!name.equals("Stop")){
		System.out.println("Enter data");
		name=br.readLine();
		System.out.println("data is " +name);
	}
	br.close();
	in.close();
}
}
