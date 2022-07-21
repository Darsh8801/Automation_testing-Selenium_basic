package mca01;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nine {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://google.com");
		Driver.manage().window().maximize();
        
		//Take the screenshot
	    File screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
	        
	    //Copy the file to a location and use try catch block to handle exception
	    try 
	    {
	            FileUtils.copyFile(screenshot, new File("C:\\phto\\abc.jpeg"));
	    } 
	    catch (IOException e) 
	    {
	            System.out.println(e.getMessage());
	    }
	        
	    //closing the webdriver
	    Driver.close();

	}

}
