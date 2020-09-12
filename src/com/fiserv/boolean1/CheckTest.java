package com.fiserv.boolean1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/"); // no time limit //if page load cross 150sec, it will abort and throw exception
		
		System.out.println(driver.getCurrentUrl());
		
//		if(driver.findElement(By.id("OneWay")).isSelected())
//		{
//			System.out.println("selected");
//		}
//		else
//		{
//			driver.findElement(By.id("OneWay")).click();
//		}
		
		//code stays always
		if(driver.findElement(By.xpath("//*[@id='ReturnDate']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id='ReturnDate']")).sendKeys("Sun, 20 Sep, 2020");
		}
			
		//on dynamic page
		if(driver.findElements(By.xpath("//*[@id='ReturnDate']")).size()>0)
		{
			driver.findElement(By.xpath("//*[@id='ReturnDate']")).sendKeys("Sun, 20 Sep, 2020");
		}
	}

}






