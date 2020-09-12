package com.fiserv.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MineTest2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://profit.novactech.in/PROFIT/Home/Home.aspx");
		
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//        .pollingEvery(Duration.ofSeconds(1))
//        .ignoring(NoSuchWindowException.class);
//		
//		WebElement ele= wait.until(new Function<WebDriver, WebElement>() {
//			@Override
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.xpath(""));
//			}
//		});
//		ele.sendKeys("hello123");
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .pollingEvery(Duration.ofSeconds(1))
		        .ignoring(NoAlertPresentException.class)
		        .withTimeout(Duration.ofSeconds(10));
				
		
		
		Alert alert = wait.until(new Function<WebDriver, Alert>() {
			@Override
			public Alert apply(WebDriver t) {
				// TODO Auto-generated method stub
				return driver.switchTo().alert();
			}
		});	
		String text = alert.getText();
		
		


	}
}
