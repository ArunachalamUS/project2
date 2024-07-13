package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class BaseTestNg {
	 WebDriver driver;
	 
	@Test
	private  void launch_bigbaket() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.bigbasket.com/");
	}
	
	@Test(dependsOnMethods = "launch_bigbaket" )
	private  void Search_btn() {
	   driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]")).sendKeys("apple");
	}
	
	@Test(dependsOnMethods ="Search_btn" )
	private void Enter_btn() throws AWTException, InterruptedException  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(10000);
		Robot a= new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods ="Enter_btn")
	private void add_btn() throws InterruptedException{
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("(//button[@color=\"rossoCorsa\"])[3]"));
		element.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}
	
	@Test(dependsOnMethods ="add_btn" )
	private void add2cart_btn() throws InterruptedException  {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		WebElement element3 = driver.findElement(By.cssSelector("[class=\"px-1.5 w-9cursor-pointer rounded-2xs py-1.5  bg-rossoCorsa-50 relative\"]"));
		element3.click();
		
		WebElement element = driver.findElement(By.id("multiform"));
		element.sendKeys("6382113738");
		
		WebElement element2 = driver.findElement(By.cssSelector("[type=\"submit\"]"));
		element2.click();
	}
	@Test(dependsOnMethods ="add2cart_btn"
			+ "" )
	private void checkout_btn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		Thread.sleep(30000);
		WebElement element = driver.findElement(By.xpath("(//button[@color=\"rossoCorsa\"])[2]"));
		element.click();
	}
}
