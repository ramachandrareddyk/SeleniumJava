package com.Java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataPOI {

	public static void main(String args[]) throws Exception {
		File file1 = new File("Student.xls");
		FileInputStream file = new FileInputStream(file1);
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row; 
		HSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(HSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				
				while (cells.hasNext())
				{
					cell=(HSSFCell) cells.next();
					System.out.print(cell.getStringCellValue()+" ");
				}
			System.out.println();
		}

	}
	
}
