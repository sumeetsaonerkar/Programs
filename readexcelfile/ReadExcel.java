package readexcelfile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\New folder\\Registration1.xls");   // if .xls then HSSF if .xlsx then XSSF
		
		FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook mywb = new HSSFWorkbook(input);     
		
		HSSFSheet sheet = mywb.getSheet("LoginData");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount+1);
		
		for(int i=0; i< rowCount+1; i++){
		
			int colCount = sheet.getRow(i).getLastCellNum();
			String str= "";
			for(int j=0; j<colCount; j++){
				String name = sheet.getRow(i).getCell(j).getStringCellValue();
				
				 str = str + " "+ name;
			}
			System.out.println(str);
		}
	
	}
		
	}


