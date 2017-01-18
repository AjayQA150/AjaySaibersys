package collections;

import java.io.FileWriter;
import java.util.Properties;

public class Test2 {
public static void main(String[] args) throws Exception {
	Properties p=new Properties();
	p.setProperty("name", "Sonoojaiswal");
	p.setProperty("email", "Sonoojaiswal@gmail.com");
	p.store(new FileWriter("info.properties"), "Javatpoint Properties example");
	
	
}
}
