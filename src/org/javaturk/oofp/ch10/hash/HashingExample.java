
package org.javaturk.oofp.ch10.hash;

/**
 * JVM's implementation of <code>static final int hash(Object key)</code> in HashMap class.
 * @author akin
 *
 */
public class HashingExample {

	/**
	 * @author akin
	
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hash codes for integers.");
		int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000, 1231, 1237};
		for(int i : ints)
			System.out.println("Hash for " + i + ": " + hash(i));
		
		System.out.println("\nHash codes for chars.");
		char[] chars = {'a', 'A', 'b', 'B', ' ', '.', '?'};
		for(char c : chars)
			System.out.println("Hash for " + c + ": " + hash(c));
		
		System.out.println("\nHash codes for doubles.");
		double[] doubles = {1.0, 1.1, 2.0, 10.0, 100.0, 1000.0};
		for(double d : doubles)
			System.out.println("Hash for " + d + ": " + hash(d));
		
		System.out.println("\nHash codes for booleans.");
		boolean[] booleans = {true, false};
		for(boolean b : booleans)
			System.out.println("Hash for " + b + ": " + hash(b));
		
		System.out.println("\nHash codes for Strings.");
		String[] strings = {"a", "A", "b", "B", "Akin", "Kaldiroglu", "Akin Kaldiroglu"};
		for(String s: strings)
			System.out.println("Hash for " + s + ": " + hash(s));

	}
	
	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
