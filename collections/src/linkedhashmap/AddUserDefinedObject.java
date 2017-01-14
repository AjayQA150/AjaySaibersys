package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class AddUserDefinedObject {

	public static void main(String[] args) {
LinkedHashMap<Integer, Employee> linkedhashmap=new LinkedHashMap<Integer,Employee>();
Employee John=new Employee(25,"John",10000);
Employee David=new Employee(23,"David",10050);
Employee Peter=new Employee(25,"Peter",10010);
linkedhashmap.put(20, John);
linkedhashmap.put(21, David);
linkedhashmap.put(22, Peter);
System.out.println("linkedhashmap : "+linkedhashmap );
Set<Integer> set=linkedhashmap.keySet();
System.out.println("set :" +set);
for(Integer key:set){
	Employee value=linkedhashmap.get(key);
	System.out.println(key +" | " +value );
}


	}

}
