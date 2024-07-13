package com.basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class BaseClass {
	public static WebDriver driver;
	//webdriver launcher.
	public static void webbrowserlauncher(String value) {
		if (value.equalsIgnoreCase("chrome")) {
		driver =new ChromeDriver();
		}
		else if (value.equalsIgnoreCase("Firefox")) {
		driver =new FirefoxDriver();
		}
	    else if (value.equalsIgnoreCase("Edge")) {
		driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
	 }
	
	//geturl
	public static void geturl(String url) {
	    driver.get(url);
	}
	
	
	//clickelement
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	//sendkeys
	public static void sendkeys(WebElement element , String value) {
		
		element.sendKeys(value);
		
	}
	
	//screensshort
	public static void screenshort(String name) throws IOException {
		TakesScreenshot screenshort =(TakesScreenshot)driver;
		File source =screenshort.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\new\\eclipse-workspace\\newproject\\screenshort\\"+name+".png");
		FileHandler.copy(source, destination);
}
	
	
	
//close
	public static void close() {
		driver.close();
	}
	
	//quit
     public static void quit() {
	     driver.quit();
	
}
	

	}





