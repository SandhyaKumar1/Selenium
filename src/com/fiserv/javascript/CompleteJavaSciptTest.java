package com.fiserv.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteJavaSciptTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://account.magento.com/customer/account/login/"); 
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='balaji'");
		
		js.executeScript("document.getElementById('send2').click()");
		
		

	}

}
