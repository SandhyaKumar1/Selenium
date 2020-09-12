package com.fiserv.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@src,'RSLogin')]")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test12");
		//click on continue
		
		if(driver.findElement(By.name("fldLoginUserId")).isEnabled())
		{
			//click
		}
		
		driver.switchTo().defaultContent();
		
	}

}
