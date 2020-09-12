package com.fiserv.hdfc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLoginTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/"); 
		
		
//		driver.switchTo().frame(10);
		
		//using name or id
		driver.switchTo().frame("login_page");
		
		//using index
		//driver.switchTo().frame(0);
		
		//using webelement
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@src,'RSLogin')]")));
		
		//do all the operation inside the frame
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("test123");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		//comeout of the frame--> main html
		//driver.switchTo().defaultContent();
				
	}

}
