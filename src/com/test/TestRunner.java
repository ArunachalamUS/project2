package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner{
  
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
   WebDriver driver = new ChromeDriver();
    driver.get("https://www.bigbasket.com/");
    WebElement searchbtn = driver.findElement(By. xpath("(//input[@placeholder=\"Search for Products...\"])[2]"));
    searchbtn.sendKeys("apple");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    Robot rob =new Robot();
    rob.keyPress(KeyEvent.VK_ENTER);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

  driver.findElement(By.xpath("(//button[@pattern=\"outline\"])[3]")).click();

driver.findElement(By.cssSelector("[class=\"flex flex-col lg:w-60 xl:w-82\"]")).click();
	
    }

}
