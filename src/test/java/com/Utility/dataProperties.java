package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class dataProperties {
public	String url;
public String username;
public String username1; 
public String password;
public String password1;
 
public dataProperties() {
	data();
}
public void data() {
	File file = new File("C:\\Pilot_Project\\Venture_Vultures-OrangeHRM\\src\\test\\resources\\data.properties");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	try {
		prop.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
}
      url =prop.getProperty("url");
	username =prop.getProperty("username");
	username1= prop.getProperty("username1");
	password=prop.getProperty("password");
	password1=prop.getProperty("password1");
 
}
}
