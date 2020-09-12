package com.fiserv.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementJavaScriptTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		//driver.findElement(By.xpath("//input[@id='authUser']")).sendKeys("admin");
		
		WebElement userEle= driver.findElement(By.xpath("//input[@id='authUser']"));
		js.executeScript("arguments[0].value='admin'",userEle);
		
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//li[text()='Logout']")).click();
		//js.executeScript("aruguments[0].click()",driver.findElement(By.xpath("//li[text()='Logout']")));
		
		WebElement logoutEle=driver.findElement(By.xpath("//li[text()='Logout']"));
		js.executeScript("arguments[0].click()",logoutEle);
		

	}

}
