package com.fiserv.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		driver.findElement(By.xpath("//input[@id='authUser']")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
//		WebElement lanEle= driver.findElement(By.name("languageChoice"));
//		Select selectLanguage=new Select(lanEle);
//		selectLanguage.selectByVisibleText("English (Indian)");
		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		//button[@class='btn btn-default btn-lg']
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}
}
