package org.javaturk.oofp.util;

public class MemoryUtil {
	private static final double MB = 1024 * 1024;
	private static final double KB = 1024;
	private static Runtime runtime = Runtime.getRuntime();

	public static void getMemory() {
		System.err.println("* * *  Heap Sizes * * * ");
		long maxMemorySize = runtime.maxMemory();
		System.err.printf("%-20s %10.4f MB (%10.4f KB) \n", "Max memory size:", maxMemorySize / MB, maxMemorySize / KB);

		long totalMemory = runtime.totalMemory();
		System.err.printf("%-20s %10.4f MB (%10.4f KB) \n", "Total memory size :", totalMemory / MB, totalMemory / KB);

		long freeMemorySize = runtime.freeMemory();
		System.err.printf("%-20s %10.4f MB (%10.4f KB) \n", "Free memory size: ", freeMemorySize / MB, freeMemorySize / KB);

		long usedMemorySize = totalMemory - freeMemorySize;
		System.err.printf("%-20s %10.4f MB (%10.4f KB) \n", "Used memory size: ", usedMemorySize / MB, usedMemorySize / KB);
	}
}
