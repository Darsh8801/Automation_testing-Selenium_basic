package mca01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fourteen {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\one\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			FileInputStream fs = new FileInputStream("D:\\\\one\\\\mca01\\\\src\\\\final.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int lastRow = sheet.getLastRowNum();
			for(int i=0; i<=lastRow; i++)
			{
				Row row = sheet.getRow(i);
				Cell cell = row.createCell(2);
				cell.setCellValue("WriteintoExcel");
			}

			FileOutputStream fos = new FileOutputStream("D:\\\\one\\\\mca01\\\\src\\\\final.xlsx");
			workbook.write(fos);
			fos.close();
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			//System.out.println(sheet.getRow(0).getCell(0));
			Row row1 = sheet.getRow(1);
			Cell cell1 = row1.getCell(1);
			//System.out.println(sheet.getRow(0).getCell(1));
			Row row2 = sheet.getRow(1);
			Cell cell2 = row2.getCell(1);
			//System.out.println(sheet.getRow(1).getCell(0));
			Row row3 = sheet.getRow(1);
			Cell cell3 = row3.getCell(1);
			//System.out.println(sheet.getRow(1).getCell(1));
			XSSFCell a1 = sheet.getRow(0).getCell(0);
			XSSFCell a2 = sheet.getRow(0).getCell(1);
			System.out.println(a1);
			System.out.println(a2);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys(a1.toString());
			driver.findElement(By.id("pass")).sendKeys(a2.toString());
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
		}
	}
