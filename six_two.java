package mca01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class six_two {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com");
		WebElement userName = Driver.findElement(By.id("email"));
		
		//1st way to use actions
		
		Actions builder = new Actions(Driver);
		builder.moveToElement(userName).click().sendKeys(userName,"mercury").doubleClick(userName).contextClick().build().perform();
		
		//2nd way to use actions
		
		Action rightmenu = builder.moveToElement(userName).click().sendKeys(userName,"mercury").doubleClick(userName).contextClick().build();
		rightmenu.perform();
		
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		//Driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL,"v");
		//Driver.close();

	}

}