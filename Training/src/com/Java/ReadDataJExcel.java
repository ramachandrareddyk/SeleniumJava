package com.Java;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadDataJExcel {
	
	public static void main(String args[]) throws Exception {
		File file = new File("Student.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet ws = wb.getSheet("StudentDetails");
		int rows = ws.getRows();
		int columns = ws.getColumns();
		for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					Cell c = ws.getCell(j, i); //cell
					System.out.print(c.getContents() + " ");
				}
			System.out.println();
			
			
		}
		
	}
	
}
