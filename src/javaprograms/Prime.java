package javaprograms;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number to check");
	int num=scan.nextInt();
for(int i=2;i<=num/2;i++){
int	temp=num%i;
if(temp==0){
	System.out.println("number is not prime");
	break;
}
else{
	System.out.println("number is prime");
	break;
}
}
}
}
