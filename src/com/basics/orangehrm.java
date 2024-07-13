package com.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangehrm   {
		

	public static void main(String[] args) {
		
			 WebDriver driver =new ChromeDriver();
			    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			   
			  String username = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]")).getText();
			    driver.findElement(By.cssSelector("[name='username'] ")).sendKeys(username);
			    
	WebElement passkey = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[2]"));
			    driver.findElement(By.cssSelector("[name='password']")).sendKeys(passkey);
			 
			
			  
			}
		
	}
	