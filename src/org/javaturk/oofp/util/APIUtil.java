package org.javaturk.oofp.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class APIUtil {
	
	public APIUtil(String name){}
	public APIUtil(String name, int i){}

	public static void main(String[] args) {
		printAPI(APIUtil.class);
	}

	public static void printAPI(String className) {

	}

	public static void printAPI(Class clazz) {
		String className = clazz.getName();
		System.out.println(className);
		
		System.out.println("Constrcutors");
		Constructor[] constructors = getConstructors(clazz);
		for (Constructor constructor : constructors) {
			System.out.println(trim(constructor.toString()));
		}
		
		System.out.println("Methods");
		Method[] methods = getMethods(clazz);
		for (Method method : methods) {
			System.out.println(method.toString());
		}

	}

	private static String trim(String string) {
		string = string.substring(string.lastIndexOf('.') - 7);
		return string;
	}
	public static void printAPI2(Class clazz) {
		String className = clazz.getName();
		System.out.println(className);

		String canonicalClassName = clazz.getCanonicalName();
		System.out.println(canonicalClassName);

		String simpleClassName = clazz.getSimpleName();
		System.out.println(simpleClassName);

		String typeName = clazz.getTypeName();
		System.out.println(typeName);

		Package itsPackage = clazz.getPackage();
		System.out.println(itsPackage.getName());
	}

	private static Constructor[] getConstructors(Class clazz) {
		return clazz.getConstructors();
	}

	private static Method[] getMethods(Class clazz) {
		return clazz.getDeclaredMethods();
	}

}
