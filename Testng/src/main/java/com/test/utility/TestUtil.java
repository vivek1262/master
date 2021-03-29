package com.test.utility;

import java.util.ArrayList;


public class TestUtil {

	static TestUtil;
	
	
	public static ArrayList<Object[]>getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
		try {
			reader = new Xls_Reader("/home/dhanvika/eclipse-workspace/Testng/src/main/java/com/excel/123.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	for(int rowNum = 2; rowNum <= reader.getRowCount("RegTestData");rowNum++) {	
		
		String firstName = reader.getCellData("RegTestData","firstName",rowNum);
		String lastName = reader.getCellData("RegTestData","lastName",rowNum);
		String username = reader.getCellData("RegTestData","username",rowNum);
		String passwd = reader.getCellData("RegTestData","passwd",rowNum);
		String confirmpasswd = reader.getCellData("RegTestData","confirmpasswd",rowNum);

	
		Object obj[] = { firstName,lastName , username , passwd , confirmpasswd };
		myData.add(obj);
				}
	return myData;
}
	}
