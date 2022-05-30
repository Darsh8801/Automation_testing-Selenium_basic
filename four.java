package mca01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class four {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\one\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
		}
		/*
		for(int i=1;i<=3;i++)
		{
				driver.findElement(By.id("hrefDecAdt")).click();
		}
		/*driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA'][2]")).click();
		
		//driver.findElement( By.id("autosuggest")).sendKeys("ind");
		
		//Thread.sleep(2000);
		//List<WebElement> countrylist = driver.findElements( By.xpath("//li[@class='ui-menu-item']/a"));
		
		/*for(WebElement country:countrylist)
		{
			if(country.getText()=="India")
			{
				country.click();
			}
		}*/

	}

}
