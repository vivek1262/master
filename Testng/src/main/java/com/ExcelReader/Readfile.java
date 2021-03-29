package com.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Readfile {
 
	 public static void main(String[] args) throws IOException
	 {
		 File src = new File("/home/dhanvika/Downloads/123.xlsx");
		 FileInputStream fis = new FileInputStream(src);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = wb.getSheetAt(0);
	int rowcount = sheet1.getLastRowNum();
	System.out.println("total row is" +rowcount+1);
	
	for(int i=0;i<rowcount;i++)
	{
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Data from row"+i+ " is "+data0);
	}
	wb.close();
	 }
}
	 
