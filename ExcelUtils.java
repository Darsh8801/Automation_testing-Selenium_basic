package mca01;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) throws IOException
	{
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static void getRowCount() throws IOException
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No. of Rows " +rowCount);
	}

	public static void getCellDataString(int r, int c) throws IOException
	{
		//String projectPath = System.getProperty("user.dir");
		//you can use this project path to replace whole path of excel file in next statement
		//workbook = new XSSFWorkbook(projectPath + "/src/introduction/excel/data.xlsx");
		//sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(r).getCell(c).getStringCellValue();
		System.out.println(cellData);
	}
	
	public static void getCellDataNumber(int r,int c) throws IOException
	{
		//String projectPath = System.getProperty("user.dir");
		//you can use this project path to replace whole path of excel file in next statement
		//workbook = new XSSFWorkbook(projectPath + "/src/introduction/excel/data.xlsx");
		//sheet = workbook.getSheet("Sheet1");
		double cellData1 = sheet.getRow(r).getCell(c).getNumericCellValue();
		System.out.println(cellData1);
	}
}
