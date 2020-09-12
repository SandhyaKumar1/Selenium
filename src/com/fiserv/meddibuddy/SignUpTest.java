package com.fiserv.meddibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.medibuddy.in/");
		
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.linkText("Sign up")).click();
		
		Thread.sleep(5000); //overcome with explicit wait, fluent wait (ignore exception), javascript
	
		driver.findElement(By.name("password")).sendKeys("hello123");		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
	}

}
