package gettersandsetters;

public class Main {
public static void main(String[] args) {
	Patient p1=new Patient();
	p1.setHeight(0);
	int height=p1.getHeight();
	System.out.println("Height :" +height);
}
}
