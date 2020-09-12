package com.fiserv.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTeamTest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		WebElement lanEle = driver.findElement(By.name("languageChoice"));
		Select selectLanguage = new Select(lanEle);
		//selectLanguage.selectByVisibleText("Dutch");
//Select f= new Select(driver.findElement(By.name("languageChoice")));

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//span[text()='Billy']
		//span[@data-bind='text:fname']
		WebDriverWait wait = new WebDriverWait(driver,50);
		//wait.ignoring(Exception.class);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Billy']")));
		
//		Actions action=new Actions(driver);	
//		action.moveToElement(driver.findElement(By.xpath("//*[text()='Patient/Client']"))).build().perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Patients']"))).click();
	//	driver.findElement(By.xpath("//*[text()='Patients']")).click();
		
		driver.switchTo().frame("fin");
		
		driver.findElement(By.id("create_patient_btn1")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("pat");
		driver.findElement(By.id("form_fname")).sendKeys("hello");
		
	}
}	
