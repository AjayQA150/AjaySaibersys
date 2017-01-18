package abstractclass;

public class factorial {
public static void main(String[] args) {
	int fact=1,n=5;
	for(int i=n;i>=1;i--){
		fact=fact*i;
	}
	System.out.println("factorial of number is " +fact);
	
}
}
