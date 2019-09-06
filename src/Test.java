import java.util.HashMap;

public class Test {
public static void main(String args[])
{
	HashMap<Employee,Integer> map = new HashMap<Employee,Integer>();
	Employee e = new Employee(2,"vipin");
	map.put(new Employee(1,"vipin"), 1);
    map.put(new Employee(3,"vipin"), 3);
	map.put(e, 2);
	map.put(new Employee(4,"vipin"), 4);
	
	System.out.println("-----------");
	System.out.println(map.get(new Employee(2,"vipin")));
	System.out.println("-----------");
	System.out.println(map.get(e));
}

}
