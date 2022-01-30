package section2.practice.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	DataFormatter df = new DataFormatter();
	FileInputStream fis = new FileInputStream("E:\\nan\\excelsheet\\Book2.xlsl.xlsx\\");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("studentdata");
	int rownum = sh.getLastRowNum();
	
	
	short sh1 = sh.getRow(0).getLastCellNum();
	
	for(int i = 0;i<rownum;i++) {
		Row ro = sh.getRow(i);
		short lastcel  = ro.getLastCellNum();
		for(int j = 0;j<sh1;j++) {
			Cell cel = ro.getCell(j);
           System.out.print(df.formatCellValue(cel) + "\t");
			
		}
		System.out.println();
	}
}
}
