
package org.javaturk.oofp.ch09.method;

import java.math.BigInteger;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.javaturk.oofp.ch09.domain.Book;

public class MethodReferences {
	public static void main(String[] args) {
		examples();
//		limitations();
	}

	public static void examples() {
		// Calling a static method
		Consumer<String> print1 = (s1) -> System.out.println(s1);
		print1.accept("Hey, what's up?");

		Consumer<String> print2 = System.out::println;
		print2.accept("Hey, what's up?");
		
		Supplier<Long> now = System::currentTimeMillis;
		System.out.println(new Date(now.get()));
		
		Function<Double, Double> twoSquared = Math::sqrt;
		System.out.println(twoSquared.apply(2.0));

		// Calling an instance method
		Book book1 = new Book("The Cat in the Hat", "Dr", "Seuss", 45);

		Consumer<Book> bookconsumer1 = (book) -> book.printInfo();
		bookconsumer1.accept(book1);

		Consumer<Book> bookconsumer2 = Book::printInfo;
		bookconsumer2.accept(book1);

//		Consumer<Book> bookconsumer3 = book -> book::printInfo;
//		bookconsumer3.accept(book1);

		// Calling an instance method by passing an argument
		Consumer<String> bookconsumer3 = book1::setAuthorFName;
		bookconsumer3.accept("Ahmet");
		System.out.println(book1);

		UnaryOperator<String> greeting = x -> "Hello, ".concat(x);
		System.out.println(greeting.apply("World"));

		UnaryOperator<String> makeGreeting = "Hello, "::concat;
		System.out.println(makeGreeting.apply("Peggy"));

		// Calling a constructor
		Supplier<Date> dateSupplier1 = () -> new Date();
		System.out.println(dateSupplier1.get());

		Supplier<Date> dateSupplier2 = Date::new;
		System.out.println(dateSupplier2.get());

		Supplier<Book> bookSupplier2 = Book::new;
		System.out.println(bookSupplier2.get());

		IntFunction<String> intToString1 = num -> Integer.toString(num);
		System.out.println("Length of string 123: " + intToString1.apply(123).length());

		// static method reference using ::
		IntFunction<String> intToString2 = Integer::toString;
		System.out.println("Length of string 4567:  " + intToString2.apply(4567).length());

		// lambdas made using a constructor
		Function<String, BigInteger> newBigInt = BigInteger::new;
		System.out.println(
				"A BigInteger object cosntructed using this string 123456789: " + newBigInt.apply("123456789"));
		
		BinaryOperator<String> binaryGreeting1 = (x, y) -> x.concat(y);
		System.out.println(binaryGreeting1.apply("Selam ", "abi :)"));
		
		BinaryOperator<String> binaryGreeting2 = String::concat;
		System.out.println(binaryGreeting2.apply("Selam ", "abi :)"));
		
		BiFunction<String, String, String> biFunctionGreeting = String::concat;
		System.out.println(biFunctionGreeting.apply("Selam ", "abi :)"));
	}

	public static void limitations() {
//		Supplier<A> aSupplier = A::new;
//		System.out.println(aSupplier.get().i);
		
		Function<Integer, A> aFunction = A::new;
		System.out.println(aFunction.apply(3).i);

		A a = new A(5);
		Consumer<Boolean> aConsumer1 = a::f1;
		aConsumer1.accept(true);
		
//		Consumer<Boolean> aConsumer2 = a::f2;
//		aConsumer2.accept(true);

		Consumer<Boolean> aStaticConsumer1 = A::ff1;
		aStaticConsumer1.accept(true);

//		Consumer<Boolean> aStaticConsumer2 = A::ff2;
//		aStaticConsumer2.accept(true);
		
		BiConsumer<Boolean, String> aStaticConsumer2 = A::ff2;
		aStaticConsumer2.accept(true, "selam");
	}
}

class A {
	int i = 5;

	A(int i) {
		this.i = i;
	}

	public void f1(boolean b) {

	}

	public void f2(boolean b, String s) {

	}

	static void ff1(boolean b) {

	}

	static void ff2(boolean b, String s) {

	}
}
