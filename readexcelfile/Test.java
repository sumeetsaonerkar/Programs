package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test {
	
	public void read() throws Throwable{
		
		File f = new File("C:\\New folder\\Registration1.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.getSheet("LoginData");
		int lastRowNo = sheet.getLastRowNum();
		System.out.println(lastRowNo);
		
	}

	public static void main(String[] args) throws Throwable {

		Test t = new Test();
		t.read();

	}

}
