package com.fiserv.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCheckTest {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/products/home?adobe_mc_sdid=SDID%3D7637F8BCF8F3F2A0-79133E651FD482E5%7CMCORGID%3D9E1005A551ED61CA0A490D45%40AdobeOrg%7CTS%3D1599288305");
//		driver.get("https://www.google.co.in/");
//		
//		driver.findElementByXPath("").click();
		if(driver.findElements(By.xpath("")).size()>0)
		{
			//perform click
		}
//		
		List<WebElement> linksEle= driver.findElements(By.tagName("abc"));
		int linkCount =  linksEle.size();
		System.out.println(linkCount);
		
		for(int i =0;i<linkCount;i++)
		{
			String innerText = linksEle.get(i).getText();
			System.out.println(innerText);
			
			String href = linksEle.get(i).getAttribute("href");
			System.out.println(href);
			
			if(innerText.trim().equals("Products"))
			{
				linksEle.get(i).click();
				break;
			}
		}
		for(WebElement ele : linksEle)
		{
			String innerText = ele.getText();
			System.out.println(innerText);
			
			String href = ele.getAttribute("href");
			System.out.println(href);
			
			if(innerText.trim().equals("Products"))
			{
				ele.click();
				break;
			}
		}
		

	}
}




