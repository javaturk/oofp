package org.javaturk.oofp.ch12.stream.source;

import java.util.function.Supplier;

import org.javaturk.oofp.ch12.domain.Person;
import org.javaturk.oofp.ch12.domain.PersonFactory;

public class MyPersonSupplier implements Supplier<Person> {

	static int count;
	
	@Override
	public Person get() {
		count++;
		System.out.println("in get() of MyPersonSupplier");
		return PersonFactory.createPerson();
	}

}
