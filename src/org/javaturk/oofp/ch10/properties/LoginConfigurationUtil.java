
package org.javaturk.oofp.ch10.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginConfigurationUtil {
	private static Properties captions = new Properties();
	
	static String captionsFile = "resources/captions.properties";

	static {
		FileReader in = null;
		try {
			in = new FileReader(captionsFile);
		} catch (FileNotFoundException e1) {
			System.out.println("Problem with opening the file: " + captionsFile);
		}
		try {
			captions.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public LoginConfigurationUtil() {

	}

}
