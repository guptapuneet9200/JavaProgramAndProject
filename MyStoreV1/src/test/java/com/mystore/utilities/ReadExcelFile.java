package com.mystore.utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFile {
	
	public static FileInputStream inputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo) {
		
		try {
			inputStream = new FileInputStream(fileName);
		
		workbook = new XSSFWorkbook(inputStream);
		excelSheet = workbook.getSheet(sheetName);
		cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
		workbook.close();
		return cell.getStringCellValue();
		
		
			} 
		catch (Exception e) 
		{
			
			return "";
		}
		
		}
	
	public static int getRowCount(String fileName, String sheetName) {
		
		try {
		inputStream = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(inputStream);
		excelSheet = workbook.getSheet(sheetName);
		
		//Get total no. of rows
		int ttlRows = excelSheet.getLastRowNum()+1;
		workbook.close();
		
		return ttlRows;
		}
		
		catch(Exception e){
			
			return 0;
		}
		
	}
	
	
	public static int getColCount(String fileName, String sheetName) {
		
		try {
		inputStream = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(inputStream);
		excelSheet = workbook.getSheet(sheetName);
		
		//Get total no. of rows
		int ttlCells = excelSheet.getRow(0).getLastCellNum();
		workbook.close();
		
		return ttlCells;
		}
		
		catch(Exception e){
			
			return 0;
		}
		
	}
	
	
	
	
	
}
