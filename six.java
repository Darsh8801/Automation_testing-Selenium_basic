package mca01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class six
		{

			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\\\one\\\\chromedriver.exe");
				WebDriver Driver = new ChromeDriver();
				Driver.get("https://www.facebook.com");
				Driver.manage().window().maximize();
				Driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
				Thread.sleep(7000);
				Driver.navigate().refresh();
				Thread.sleep(5000);
				Driver.close();

			}
			
		}
