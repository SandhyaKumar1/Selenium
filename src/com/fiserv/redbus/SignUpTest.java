package com.fiserv.redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.xpath("//li[@class = 'config-options']")).click();

		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("9159821614");
		
		//generate otp
		//comeout of frame
		
		driver.switchTo().defaultContent();

	}

}
