package org.javaturk.oofp.ch12.stream.source;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.Person;
import org.javaturk.oofp.ch12.domain.PersonFactory;

public class PersonStreams {

	public static void main(String[] args) {

//		// Creating a stream from a Collection
//		System.out.printf("********************************************************\n");
//		System.out.printf("From a Collection:\n");
//		List<Person> persons = PersonFactory.generatePersonList(10_000);
//		Stream<Person> personStream = persons.parallelStream();
//		System.out.printf("Number of persons: %d\n", personStream.count());
//		System.out.printf("********************************************************\n");
//		System.out.printf("\n");

		// Using a generator
		System.out.printf("********************************************************\n");
		System.out.printf("From a Supplier:\n");
		Supplier<Person> supplier = new MyPersonSupplier();
		Stream<Person>  personStream = Stream.generate(supplier);
//		personStream = Stream.generate(() -> PersonFactory.createPerson());
//		personStream = Stream.generate(PersonFactory::createPerson);
		personStream.filter((p) -> p.getFirstName().startsWith("Ğ")).limit(10).forEach(System.out::println);
		System.out.println("Count: " + MyPersonSupplier.count);
		System.out.printf("********************************************************\n");
		System.out.printf("\n");

	}

}
