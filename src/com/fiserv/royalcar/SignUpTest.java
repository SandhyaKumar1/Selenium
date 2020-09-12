package com.fiserv.royalcar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.royalcaribbean.com/account/create");
		
//		(//div[@class='mat-select-arrow-wrapper'])[2]
		
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dec')]")).click();

		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'20') and @class='mat-option-text']")).click();
		

	}
}




