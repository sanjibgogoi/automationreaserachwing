package com.arw.arwrnd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtility {

	public static Properties prop = new Properties();
	FileInputStream input = null;
	public static String projectPath = System.getProperty("user.dir");

	public void initialiseProperties() {
		File file = new File(projectPath + "/data/OR.properties");
		try {
			input = new FileInputStream(file);
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
}
