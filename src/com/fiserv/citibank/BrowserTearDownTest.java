package com.fiserv.citibank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserTearDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");

		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
