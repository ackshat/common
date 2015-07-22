package hashandequals;

import java.util.HashSet;

public class TestHashAndEquals {

	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Alok", 25);
		Employee emp2 = new Employee("Alok", 25);
		
		HashSet<Employee> hashSetEmp = new HashSet<>();
		hashSetEmp.add(emp1);
		hashSetEmp.add(emp2);
		
		
		System.out.println("emp1 hashCode "+emp1.hashCode());
		System.out.println("emp2 hashCode "+emp2.hashCode());
		
		System.out.println(hashSetEmp.toString());
	}
	
}
