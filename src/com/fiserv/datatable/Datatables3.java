package com.fiserv.datatable;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datatables3 {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Work\\chromedriver_win32-V85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int valueFinal = 0;
		int valueint = 0;
		int next = 0;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://datatables.net/");
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='example_length']")));
		s1.selectByValue("50");
		do {
			int num = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
			for (int i = 1; i <= num; i++) {
				String a = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[4]")).getText();
				int aa = Integer.parseInt(a);
				if (aa >= 50) {
					driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).click();
					String value = driver.findElement(By.xpath("//tr[@class='child'] //span[@class='dtr-data']"))
							.getText();
					String nvalue = value.replace("$", "");
					String mvalue = nvalue.replace(",", "");
					valueint = Integer.parseInt(mvalue);
					if (valueint >= 200000) {
						valueFinal = valueint + valueFinal;
						System.out.println(driver
								.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).getText());
					}
					driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).click();
				}
			}
			System.out.println(driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("tabindex"));

			if (driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("tabindex").equals("-1")) {
				break;
			} else {
				driver.findElement(By.xpath("//a[@class='paginate_button next']")).click();
				Thread.sleep(1000);
				next = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
			}

		} while (!(next == 0));
		System.out.println("sum of Salary : " + valueFinal);
	}
}
