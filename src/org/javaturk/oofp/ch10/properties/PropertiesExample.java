/* Ch 07
 * PropertiesExample.java
 */

package org.javaturk.oofp.ch10.properties;

import java.util.*;
import java.io.*;

public class PropertiesExample {
	private static String file = "./src/org/javaturk/oofp/ch08/properties/resources/myPropertiesX.properties";
	private static String xmlFile = "./src/org/javaturk/oofp/ch08/properties/resources/myPropertiesXML2.properties";

	
	public static void main(String args[]) throws IOException {
		Properties settings = new Properties();
		settings.setProperty("tempz", "C:\\Windows\\Temp");
		settings.setProperty("classpath", "C:\\java");
		settings.setProperty("ip", "192.168.1.12");
		settings.setProperty("user", "root");
		settings.setProperty("password", "password");
		settings.setProperty("names", "akin, john, selma");
		
		System.out.println(settings.getProperty("ip"));
//		
//		storePropertiesToAFile(settings);
//		System.out.println();
		storePropertiesToXMLFile(settings);
//		loadProperties();
//		showProperties(settings);
//		storePropertiesWithDefaultsToAFile();
	}

	public static void storePropertiesToAFile(Properties settings) {
		System.out.println("Storing properties.");
		
		FileWriter out = null;
		try {
			out = new FileWriter(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			settings.store(System.out, "Environment Settings");
			settings.store(out, "Environment Settings");
		} catch (IOException e) {
		}
	}
	
	public static void storePropertiesToXMLFile(Properties settings) {
		System.out.println("Storing properties in an XML file.");
		
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(xmlFile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			settings.storeToXML(System.out, "Environment Settings");
			settings.storeToXML(out, "Environment Settings", "UTF-8");
		} catch (IOException e) {
		}
	}
	
	public static void loadProperties(){
		System.out.println("\nLoading properties.");
		Properties settings = new Properties();
		FileReader in = null;
		try {
			in = new FileReader(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			settings.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		settings.list(System.out);
	}
	
	public static void storePropertiesWithDefaultsToAFile() {
		System.out.println("Storing properties with defaults.");

		Properties defaultSettings = new Properties();
		defaultSettings.setProperty("tempz", "Default file");
		defaultSettings.setProperty("classpath", "default path");
		defaultSettings.setProperty("ip", "defualtIP");
		defaultSettings.setProperty("user", "rootDefault");
		defaultSettings.setProperty("password", "passwordDefault");
		defaultSettings.setProperty("names", "akin, john, selma");
		
		
		Properties settings = new Properties(defaultSettings);
		System.out.println("tempz: " + settings.getProperty("tempz"));
//		settings.setProperty("tempz", "C:\\Windows\\Temp");
//		settings.setProperty("classpath", "C:\\java");
//		settings.setProperty("ip", "192.168.1.12");

		FileWriter out = null;
		try {
			out = new FileWriter(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			settings.store(System.out, "Environment Settings");
			settings.store(out, "Environment Settings");
		} catch (IOException e) {
		}
		loadProperties();
	}
	
	public static void showProperties(Properties settings){
		System.out.println("IP: " + settings.getProperty("ip"));
		
		System.out.println("IP: " + settings.getProperty("ipX"));
		System.out.println("IP: " + settings.getProperty("ipX", "10.10.10.10"));
		
		System.out.println("\nAll of the property names:");
		Enumeration<String> propertyNames =	(Enumeration<String>) settings.propertyNames();
		while(propertyNames.hasMoreElements())
			System.out.println(propertyNames.nextElement());

	}
}
