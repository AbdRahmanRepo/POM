package com.TestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writter {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\QuickBuy\\target\\DataReader.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet1 = wb.createSheet("schoolsheet");
		Row row1 = sheet1.createRow(0);
		
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue("ID No");
		
		Cell cell2 = row1.createCell(1);
		cell2.setCellValue("Std Name"); 
		
		Cell cell3 = row1.createCell(2);
		cell3.setCellValue("location");
		
		wb.getSheet("shoolsheet").createRow(1).createCell(0).setCellValue("001");
		wb.getSheet("shoolsheet").getRow(1).createCell(0).setCellValue("Abdul");
		wb.getSheet("shoolsheet").createRow(1).createCell(0).setCellValue("chennai");
		
		wb.getSheet("shoolsheet").createRow(2).createCell(0).setCellValue("Senthil");
		wb.getSheet("shoolsheet").getRow(1).createCell(0).setCellValue("002");
		wb.getSheet("shoolsheet").getRow(1).createCell(0).setCellValue("Bangalore");
		
		wb.getSheet("shoolsheet").createRow(1).createCell(0).setCellValue("Rasith");
		wb.getSheet("shoolsheet").getRow(1).createCell(0).setCellValue("003");
		wb.getSheet("shoolsheet").getRow(1).createCell(0).setCellValue("Keraala");
		
	}

}
