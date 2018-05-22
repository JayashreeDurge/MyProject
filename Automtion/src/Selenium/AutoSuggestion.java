package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayashree\\eclipse-workspace\\Automtion\\src\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total no of links = "+list.size());
		int i ;
		for (i=0; i<list.size();i++)
		{
			String s =list.get(i).getText();
			if(s.contains("selenium")) {
			System.out.println(s);
			}
		}
		//driver.close();
	}

}
