package com.logpom;

import org.testng.annotations.Test;

public class LoginPom {

	@Test(priority = 2, dataProvider = "login")
	private static String[][] Getvalue() {
		String[][] data = new String[1][1];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
	return data;
}}
