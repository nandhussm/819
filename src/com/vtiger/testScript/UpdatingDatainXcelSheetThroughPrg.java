package com.vtiger.testScript;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdatingDatainXcelSheetThroughPrg {
   public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("E:\\nan\\excelsheet\\Book1.xlsl.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	sh.getRow(4).createCell(2).setCellValue("dinesh");
	
	FileOutputStream fos = new FileOutputStream("E:\\nan\\excelsheet\\Book1.xlsl.xlsx");
	book.write(fos);
	fos.flush();
	fos.close();
	System.out.println("pass");
}
}
