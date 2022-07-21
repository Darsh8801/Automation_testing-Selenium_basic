package mca01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class thirteen {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("4.1.8_0.crx"));
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\one\\\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(opt);
		
		
		Driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/options.html");
		Thread.sleep(3000);
		Driver.findElement(By.id("language-selector")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//option[@value='hi']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.id("save-btn")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)Driver).executeScript("window.open()");
		//Driver.switchTo().window(parent);
		ArrayList<String> tabs = new ArrayList<String>(Driver.getWindowHandles());
		
		Driver.switchTo().window(tabs.get(1));
		
		Driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/browser_action.html");
		
		Driver.findElement(By.id("query-field")).sendKeys("computer");
		Driver.findElement(By.id("define-btn")).click();
		
		Thread.sleep(10000);
		
		Driver.close();

	}

}

