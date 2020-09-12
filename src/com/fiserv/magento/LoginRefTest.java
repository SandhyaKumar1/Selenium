package com.fiserv.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/"); //wait until page load happen // no time limit 
		
		By myAccLoc= By.linkText("My Account");
		WebElement myAccEle= driver.findElement(myAccLoc);
		myAccEle.click();
	}

}
