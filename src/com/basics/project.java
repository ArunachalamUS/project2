package com.basics;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.LoginPom;

public class project extends LoginPom    {

	public static void main(String[] args) throws IOException  {
		LoginPom lop =new LoginPom();
		
		String name =lop.getName();
		System.out.println(name);
		lop.setName("arunachalam");
		String updatename =lop.getName();
		System.out.println("updatename  :"+updatename);
		 
		int rollnumber =lop.getRollnumber();
		System.out.println(rollnumber);
		lop.setRollnumber(21);
		int updatedrollnumber =lop.getRollnumber();
		System.out.println("updatedrollnumber  :"+updatedrollnumber);
		
		int Age = lop.getAge();
		System.out.println(Age);
		lop.setAge(25);
		int updatedage = lop.getAge();
		System.out.println("updatedage  :"+updatedage);
		
		String cityname = lop.getCityname();
		System.out.println(cityname);
		lop.setCityname("mudurai");
	    String updatedcityname = lop.getCityname();
	    System.out.println("updatedcityname  :"+updatedcityname);
	    
	    int mobilenumber = lop.getMobilenumber();
	    System.out.println(mobilenumber);
	    lop.setMobilenumber(23456789);
	    int updatedmobilenumber = lop.getMobilenumber();
	    System.out.println("updatedmobilenumber  :z"+updatedmobilenumber); 
	}
}
