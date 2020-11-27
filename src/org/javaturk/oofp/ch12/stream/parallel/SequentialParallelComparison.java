package org.javaturk.oofp.ch12.stream.parallel;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class SequentialParallelComparison {
	private static Random random = new Random();

	public static void main(String[] args) {
//		String[] strings = CollectionFactory.getStringIntArray();
		String[] strings = CollectionFactory.getStringArrayBySize(100_000_000);
		 
//		IntStream intStream = random.ints(1_000);
//		System.out.println("---------------------\nRunning sequential\n");
//		runFilteringMappingAndCounting(Arrays.stream(strings));
//		System.out.println("---------------------");
//		run(intStream.sequential());

		 System.out.println("-------\nRunning parallel\n-------");
		runFilteringMappingAndCounting(Arrays.stream(strings).parallel());
//		 run(intStream.parallel());
	}
	
	public static void run(IntStream stream) {
		Instant now = Instant.now();
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method is short and includes no context switching.
	 * 
	 * @param stream
	 */
	public static void runShort(Stream<String> stream) {
		System.out.println("");
		Instant now = Instant.now();
		stream.forEach(s -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method takes longer and includes no context switching.
	 * 
	 * @param stream
	 */
	public static void runLong(Stream<String> stream) {
		Instant now = Instant.now();
		stream.forEach(s -> {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method includes very intensive context switching due to writing on the
	 * console.
	 * 
	 * @param stream
	 */
	public static void runWithContextSwitching(Stream<String> stream) {
		Instant now = Instant.now();
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
		});

		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method includes very intensive context switching due to writing on the
	 * console.
	 * 
	 * @param stream
	 */
	public static void runFilteringMappingAndCounting(Stream<String> stream) {
		Instant now = Instant.now();
		System.out.println("Thread name: " + Thread.currentThread().getName());
		long size = stream.map(s -> Integer.parseInt(s)).filter(i -> i % 2 == 0).map(i -> Math.sqrt(Math.sqrt(i))).map(i -> i * i * i * i).filter(i -> i > 5).count();
		System.out.println("Size: " + size);
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}
	
	public static void runFilteringMappingAndCollecting(Stream<String> stream) {
		Instant now = Instant.now();
		Set<Double> set = stream.map(s -> Integer.parseInt(s)).filter(i -> i % 2 == 0).map(i -> Math.sqrt(i)).collect(Collectors.toSet());
		System.out.println("Size: " + set.size());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method includes very intensive context switching due to writing on the
	 * console.
	 * 
	 * @param stream
	 */
	public static void runFilteringAndMapping(Stream<String> stream) {
		Instant now = Instant.now();
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
		});

		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}

	/**
	 * This method includes very intensive context switching due to writing on the
	 * console.
	 * 
	 * @param stream
	 */
	public static void runFilteringAndMappingAndSumming(Stream<String> stream) {
		Instant now = Instant.now();
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
		});

		Instant then = Instant.now();
		long gap = ChronoUnit.MILLIS.between(now, then);
		System.out.println("Time in ms: " + gap);
	}
}
