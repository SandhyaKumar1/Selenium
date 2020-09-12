package com.fiserv.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.findElement(By.id("search")).sendKeys(new String[] { "Nike Club Fleece Pullover Hoodie" });
		driver.findElement(By.name("submit-search")).click();
		driver.findElement(By.xpath("//a[contains (@rel,'/product/prd-3854119/boys-4-7-nike-club-fleece-pullover')]"))
				.click();
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains
		// (@id,'pdpTitle_panel85458823')]")));
		Thread.sleep(5000);
		//wait.ignoring(Exception.class);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='7']")));
		driver.findElement(By.linkText("7")).click();
		
		int qty=7;
		for(int i=2;i<=qty;i++)
		{
			driver.findElement(By.xpath("//*[@data-qttyoptn='increase']")).click();
		}
		
		//document.getElementById('panel32659589').value=7
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='7'", driver.findElement(By.name("productQuantity")));
		
		//int qty=9;
		//js.executeScript("arguments[0].value='"+qty+"'", driver.findElement(By.name("productQuantity")));
		
		String att= driver.findElement(By.name("productQuantity")).getAttribute("value");
		System.out.println(att);
		// driver.findElement(By.name("productQuantity")).sendKeys(new String[]{"5"});
		driver.findElement(By.id("addtobagID")).click();

	}

}
