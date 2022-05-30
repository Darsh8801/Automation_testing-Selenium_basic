package mca01;

import java.awt.AWTException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver","D:\\one\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		
		//Way - 1 with file path and sendkeys
		
		driver.findElement(By.id("file-upload")).sendKeys("D:\\med\\Documents\\resume.docx");
		Thread.sleep(6000);
		System.out.println("File successfully uploaded");
	}

}
