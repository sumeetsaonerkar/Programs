package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="getData")
public class DataProviderDemo {

	
	@DataProvider(name="getData")
	public String[][] fetchData() throws Throwable{
		
		File f = new File("C:\\New folder\\test1.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("data");
		
		int totalRow = sheet.getLastRowNum()+1;
		
		int totalCol = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[totalRow][totalCol];
		
		for(int i=0; i<totalRow; i++){
			
			data[i][0] = sheet.getRow(0).getCell(0).getStringCellValue();
			data[i][1] = sheet.getRow(0).getCell(1).getStringCellValue();
			
			
		}
		
		return data;
		
	}
	}
	
	
	

