package com.fiserv.magento;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://magento.com/"); //wait until page load happen // no time limit 
				
		driver.findElement(By.linkText("My Account")).click();  //findelement --> 500ms/0.5s to check that element for operation
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");	
		driver.findElement(By.id("pass")).sendKeys("Fiserv@12345");
		driver.findElement(By.name("send")).click();
		
		//make sure dashboard is launched - wait for logout
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
		
		String actualValue = driver.getTitle();
		System.out.println(actualValue);
		
		//click on logout
		driver.findElement(By.partialLinkText("Out")).click();
	}

}
