package com.crm.genericutiity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * To get data from the properties file
 * @author USER
 *
 */
public class CommonDataUtility {
	/**
	 * This method is used to read and retrieve data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getCommonData(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Datadriven/commondata.properties");
		Properties props=new Properties();
		props.load(fis);
		String value=props.getProperty(key);
		return value;
	}

}
