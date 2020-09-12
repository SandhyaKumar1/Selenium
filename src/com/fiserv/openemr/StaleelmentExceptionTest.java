package com.fiserv.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleelmentExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		WebElement ele= driver.findElement(By.partialLinkText("Ack"));
		
		
		ele.click();
	}

}
