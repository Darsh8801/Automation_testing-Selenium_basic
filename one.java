package mca01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://google.com");
		driver.navigate().back();
		driver.close();
	}

}
