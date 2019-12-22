package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class MyntraData {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\New folder\\test1.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("data1");
		
		int totalRows = sheet.getLastRowNum()+1;
		int totalCols = sheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCols);
		
	}

}
