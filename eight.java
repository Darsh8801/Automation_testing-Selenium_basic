package mca01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eight {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		  
			Driver.get("http://demo.guru99.com/test/web-table-element.php");
			//No.of Columns
	        List <WebElement> col = Driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List <WebElement> rows = Driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        
	        Driver.close();
	        /*
	        Driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php?index=FNO");
			//No.of Columns
	        List <WebElement> col = Driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List <WebElement> rows = Driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]")); 
	        System.out.println("No of rows are : " + rows.size());
	        
	        Driver.close();*/
	}

}
