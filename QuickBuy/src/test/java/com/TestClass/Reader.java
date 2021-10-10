package com.TestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\QuickBuy\\target\\DataReader.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet st = wb.getSheetAt(0);
		
		int rows = st.getPhysicalNumberOfRows();
		
		for (int i=0; i< rows; i++) {
			
			Row row =st.getRow(i);
			
			int cell = row.getPhysicalNumberOfCells();
//			System.out.println(cell);
			
			for (int j=0; j<3; j++) {
				 
				Cell cl = row.getCell(j);
				
				CellType ctype = cl.getCellType();
				
				if(ctype.equals(ctype.STRING)){
					
					String scv = cl.getStringCellValue();
					System.out.print(scv+"             ");
					
				} else if(ctype.equals(ctype.NUMERIC)){
					
					double ncv = cl.getNumericCellValue();
					long numVal = (long) ncv;
					System.out.print(numVal+"         ");
				}
			}System.out.println();
		
		}

	}

}
