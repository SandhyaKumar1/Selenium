package com.fiserv.citibank;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleTabsTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		Thread.sleep(5000);
		
		//session id of current tab (driver pointed tab)
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		System.out.println("------------------------------------");
		Set<String> windows= driver.getWindowHandles(); //2 sessionid
		
		for(String window : windows)
		{
			System.out.println(window);
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
	
			if(title.equalsIgnoreCase("Online Credit Card Application Form | Citi India"))
			{
				break;
			}	
		}
		
		driver.findElement(By.linkText("Travel")).click();
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		//get the title
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		

	}
}





