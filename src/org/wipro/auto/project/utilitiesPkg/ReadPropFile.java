package org.wipro.auto.project.utilitiesPkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile 
{

	public static String readconfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
}
