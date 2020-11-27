
package org.javaturk.oofp.ch10.properties;

import java.util.Enumeration;
import java.util.Properties;

public class SystemInfoExample {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
        Enumeration e = properties.propertyNames();
        while(e.hasMoreElements()){
            String key = (String) e.nextElement();
            System.out.println(key + " \t " +  properties.getProperty(key));
        }
        
        System.out.println(properties.getProperty("propertiesFile"));
	}
}
