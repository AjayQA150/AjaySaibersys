package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdduserDefinedObjects {

	public static void main(String[] args) {
		HashMap<Integer, Employee> hashmap=new HashMap<Integer,Employee>();
		
		Employee John=new Employee("john",25,10000);
		Employee Peter=new Employee("Peter",30,50000);
		Employee David=new Employee("David",26,20000);
				
		hashmap.put(1, John);
		hashmap.put(2, Peter);
		hashmap.put(3, David);
	System.out.println("hashmap contains" +hashmap);
		
		Set<Map.Entry<Integer, Employee>> entryset=hashmap.entrySet();
		System.out.println("Entryset :" +entryset);
		
		for(Map.Entry<Integer, Employee> entry:entryset){
			int id=entry.getKey();
			Employee employee=entry.getValue();
			System.out.println(id+"|"+employee);
		}
	}

}
