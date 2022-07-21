package mca01;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath+"/src/final.xlsx";
		ExcelUtils excel = new ExcelUtils(filePath, "sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(1, 0);
		excel.getCellDataNumber(1, 1);

	}

}
