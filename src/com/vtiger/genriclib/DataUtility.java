package com.vtiger.genriclib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
       public String getDataFromProperty(String key) throws IOException {
    	   FileInputStream fis = new FileInputStream("E:\\commondata\\Commondatttaaa.Properties\\");
    	   Properties pobj = new Properties();
    	   pobj.load(fis);
    	   return pobj.getProperty(key);
       }
       public String getDataFromExcel(String sheetname ,int row ,int cell ) throws EncryptedDocumentException, IOException {
    	   DataFormatter formatter = new DataFormatter();
    	   FileInputStream fis1 = new FileInputStream("E:\\nan\\excelsheet\\Book2.xlsl.xlsx");
    	   Workbook book = WorkbookFactory.create(fis1);
    	   Sheet sh = book.getSheet(sheetname);
    	   Cell value  = sh.getRow(row).getCell(cell);
    	   return formatter.formatCellValue(value);
       }
}
