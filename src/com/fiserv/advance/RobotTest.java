package com.fiserv.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//http://Username:Password@SiteURL
		//http://bala.dina:bala123@profit.novactech.in/PROFIT/Home/Home.aspx
		//driver.get("http://profit.novactech.in/PROFIT/Home/Home.aspx");
		
		String url = "http://bala.dina:bala123@profit.novactech.in/PROFIT/Home/Home.aspx";	
		driver.get("http://profit.novactech.in/PROFIT/Home/Home.aspx");	
		
		Robot rb=new Robot();
		
		String username="bala.dina";
		for(int i=0;i<username.length();i++)
		{
			System.out.println(username.charAt(i));
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(username.charAt(i)));
			Thread.sleep(500);
		}
		
		rb.keyPress(KeyEvent.VK_TAB);
		
		for(int i=0;i<username.length();i++)
		{
			System.out.println(username.charAt(i));
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(username.charAt(i)));
			Thread.sleep(500);
		}
		
		rb.keyPress(KeyEvent.VK_ENTER);
	}
}






