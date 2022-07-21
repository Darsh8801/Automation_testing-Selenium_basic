package mca01;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seven {

		public static void main(String[] args) throws InterruptedException 
		{
		
			System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			Driver.get("file:///D://medfinal//file.html");
			Driver.manage().window().maximize();
			
			String parent = Driver.getWindowHandle();
			
			System.out.println(parent);
					
			WebElement element1 = Driver.findElement(By.id("gl"));
			WebElement element2 = Driver.findElement(By.id("yh"));
			WebElement element3 = Driver.findElement(By.id("fb"));
			
			Actions action1 = new Actions(Driver);
			action1.keyDown(Keys.LEFT_CONTROL).click(element1).keyUp(Keys.LEFT_CONTROL).build().perform();
			
			Actions action2 = new Actions(Driver);
			action2.keyDown(Keys.LEFT_CONTROL).click(element2).keyUp(Keys.LEFT_CONTROL).build().perform();
			
			Actions action3 = new Actions(Driver);
			action3.keyDown(Keys.LEFT_CONTROL).click(element3).keyUp(Keys.LEFT_CONTROL).build().perform();
					
			Set<String> allwindows = Driver.getWindowHandles();
			
			int count=allwindows.size();
			
			System.out.println(count);
			
			/*for(String child:allwindows)
			{
				if(!parent.equalsIgnoreCase(child))
				{
					Driver.switchTo().window(child);
					
					Driver.findElement(By.name("q")).sendKeys("Selenium working");
					
					Thread.sleep(3000);
					
					Driver.close();
				}
			}*/
			
			//Driver.switchTo().window(parent);
			
			ArrayList<String> tabs = new ArrayList<String>(allwindows);
			
			Driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(5000);
			
			Driver.switchTo().window(tabs.get(2));
			
			Thread.sleep(5000);
			
			Driver.switchTo().window(tabs.get(3));
			
			Thread.sleep(5000);
			
			Driver.switchTo().window(tabs.get(0));
			
			Thread.sleep(3000);
			
			Driver.close();

	}

	}

