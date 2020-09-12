package com.fiserv.royalcar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusTest {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//*[text()='CMBT, Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("bangalore");
		
		driver.findElement(By.xpath("//*[text()='Majestic, Bangalore']")).click();

	}

}
