package com.fiserv.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MineTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://profit.novactech.in/PROFIT/Home/Home.aspx");
		
		Robot rb=new Robot();
		
		String name="balaji.dinakaran";
		
		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
			Thread.sleep(500);
		}
		
		rb.keyPress(KeyEvent.VK_TAB);
		
		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
			Thread.sleep(500);
		}
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		System.out.println(driver.getCurrentUrl());
		
		
		
	//	driver.findElement(By.id("")).sendKeys("2020-09-03");
		


	}
}
