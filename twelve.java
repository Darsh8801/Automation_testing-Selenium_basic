package mca01;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class twelve {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\one\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://demo.guru99.com/test/guru99home/");

        // Find the element and take a screenshot

        WebElement logoElement = Driver.findElement(By.xpath("//*[@id=\"site-name\"]/a[1]/img"));
        
        Screenshot logoElementScreenshot = new AShot().takeScreenshot(Driver, logoElement);

        // read the image to compare

        BufferedImage expectedImage = ImageIO.read(new File("C:\\\\New folder (2)\\\\abc2.jpeg"));

        BufferedImage actualImage = logoElementScreenshot.getImage();

        // Create ImageDiffer object and call method makeDiff()

        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);

        if (diff.hasDiff() == true) {
            System.out.println("Images are same");

        } else {
            System.out.println("Images are different");
        }
        Driver.close();
	
	}

}
