package com.fiserv.advance;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		// nosuchwind
		// driver.findElement(By.id("user")).sendKeys("hello");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);

		Alert alert = wait.until(new Function<WebDriver, Alert>() {
			@Override
			public Alert apply(WebDriver t) {
				// TODO Auto-generated method stub
				return t.switchTo().alert();
			}
		});
		
		System.out.println(alert.getText());
		

		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.id("authUser"));
			}
		});
		
		ele.sendKeys("hello");

	}
}
