package mca01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class three {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("crickbuzz");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		driver.get("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("MW dance creation");
		driver.findElement(By.id("search-icon-legacy")).click();
		//driver.findElement(By.xpath("//a[@class='channel-link yt-simple-endpoint style-scope ytd-channel-renderer']")).click();
		
		
		Robot robot=new Robot();
		
		//robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//robot.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(7000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div")).click();

	}

}
