package org.javaturk.oofp.ch11.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.javaturk.oofp.ch10.domain.Director;
import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;
import org.javaturk.oofp.ch10.domain.Person;

public class LowerboundedWildcardExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Mehmet", "Sade", 5));
		employees.add(new Employee(2, "Necip", "Marasli", 6));
		employees.add(new Employee(3, "Behice", "Narin", 2));

		Consumer<Employee> employeeConsumer = o -> System.out.println("Consumer<Employee>: " + o);
		Consumer<Manager> managerConsumer = o -> System.out.println("Consumer<Manager>: " + o);
		
		employees.forEach(employeeConsumer);
//		employees.forEach(managerConsumer); // Problem! managerConsumer does not satisfy Consumer<? super T> 
		
		System.out.println();
		
		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager(10, "Ali", "Nazik", 7, "Sales"));
		managers.add(new Manager(20, "Mahmut", "Tatli", 12, "HR"));
		
		managers.forEach(employeeConsumer);
		managers.forEach(managerConsumer);
		
		List<Director> directors = new ArrayList<>();
		directors.add(new Director(1, "Mehmet", "Sade", 15, "Sales", 5000));
		directors.add(new Director(2, "Necip", "Marasli", 20, "Production", 8000));
		
		System.out.println();
		
		directors.forEach(employeeConsumer);
		directors.forEach(managerConsumer);
		
		System.out.println();
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Mehmet", "Sade"));
		people.add(new Person("Necip", "Marasli"));
		people.add(new Person("Behice", "Narin"));
		
//		people.forEach(employeeConsumer);	// Problem! managerConsumer does not satisfy Consumer<? super T> because Employee is not a super type of Person
//		people.forEach(managerConsumer);	// Problem! managerConsumer does not satisfy Consumer<? super T> because Manager is not a super type of Person
		
		Consumer<Person> personConsumer = o -> System.out.println("Consumer<Person>: " + o);
		Consumer<Object> objectConsumer = o -> System.out.println("Consumer<Object>: " + o);
		
		people.forEach(personConsumer);	
		people.forEach(objectConsumer);	
		
		System.out.println();
		
		List<String> sentence = Stream.of("I", "love", "Java", " :)").collect(Collectors.toList());
		
		sentence.forEach((String s) -> System.out.println(s + " has " + s.length() + " characters."));
		System.out.println();
		sentence.forEach((Object o) -> System.out.println("Hashcode of " + o + " is " + o.hashCode()));
	}
}
