package com.fiserv.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSeleniumTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.name("q"))).pause(500).click().build().perform();
		
		action.keyDown(Keys.SHIFT).pause(1000).sendKeys("hello").pause(1000).keyUp(Keys.SHIFT).build().perform();
		
	//	action.sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		for(int i =1 ;i<=5;i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).pause(1000).build().perform();
		}
		
		
		action.pause(1000).sendKeys(Keys.ENTER).build().perform();
		

	}

}
