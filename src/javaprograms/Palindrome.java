package javaprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int sum=0,temp,r;
		
Scanner scan=new Scanner(System.in);
System.out.println("enter a number to check");
int n=scan.nextInt();
temp=n;
while(n>0){
	r=n%10;//getting the remainder
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
	System.out.println("Number is palindrome");
}
else{
	System.out.println("Number is not a palindrome");
}
}
}
