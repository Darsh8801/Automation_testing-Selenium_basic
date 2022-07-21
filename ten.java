package mca01;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ten {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		//Driver.get("http://demo.guru99.com/test/guru99home/");
				Driver.get("https://goibibo.com");
				Driver.manage().window().maximize();
				
				Screenshot screenshot = new AShot().takeScreenshot(Driver);
						
				screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\New folder\\abc.jpeg"));
				
				Driver.close();


	}

}
