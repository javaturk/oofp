package org.javaturk.oofp.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;

import static java.lang.System.out;

enum ClassMember {
	CONSTRUCTOR, FIELD, METHOD, CLASS, ALL
}

public class ClassSpy {
	private static String packageName;
	
	public static void main(String... args) {
		try {
			Class<?> c = Class.forName(args[0]);
			out.format("%s%n%n", c.getCanonicalName());

			Package p = c.getPackage();
			packageName = p.getName() + ".";
//			out.format("Package:%n  %s%n%n", (p != null ? p.getName() : "-- No Package --"));

			for (int i = 1; i < args.length; i++) {
				switch (ClassMember.valueOf(args[i])) {
				case CONSTRUCTOR:
					printMembers(c.getConstructors(), "Constructor");
					break;
				case FIELD:
					printMembers(c.getFields(), "Fields");
					break;
				case METHOD:
					printMembers(c.getDeclaredMethods(), "Methods");
					break;
				case CLASS:
					printClasses(c);
					break;
				case ALL:
					printMembers(c.getConstructors(), "Constuctors");
					printMembers(c.getFields(), "Fields");
					printMembers(c.getDeclaredMethods(), "Methods");
					printClasses(c);
					break;
				default:
					assert false;
				}
			}

			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}

	private static void printMembers(Member[] mbrs, String s) {
		out.format("%s:%n", s);
		for (Member mbr : mbrs) {
			if (mbr instanceof Field)
				out.format("  %s%n", ((Field) mbr).toGenericString());
			else if (mbr instanceof Constructor){
				String constructorString = ((Constructor) mbr).toGenericString();
				out.format("  %s%n", trim(constructorString));
			}
			else if (mbr instanceof Method){
				String methodString = ((Method) mbr).toGenericString();
				out.format("  %s%n", trim(methodString));
			}
		}
		if (mbrs.length == 0)
			out.format("  -- No %s --%n", s);
		out.format("%n");
	}

	private static String trim(String constructorString) {
		return constructorString.replace(packageName, "");
	}

	private static void printClasses(Class<?> c) {
		out.format("Classes:%n");
		Class<?>[] clss = c.getClasses();
		for (Class<?> cls : clss)
			out.format("  %s%n", cls.getCanonicalName());
		if (clss.length == 0)
			out.format("  -- No member interfaces, classes, or enums --%n");
		out.format("%n");
	}
}
