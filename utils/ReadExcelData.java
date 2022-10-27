package com.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] readSheetData(String fileName) throws IOException {
		
		XSSFWorkbook workbook= new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();
		
		String[][] data=new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String stringCellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
			
		}
		
		workbook.close();
		return data;

	}

}
