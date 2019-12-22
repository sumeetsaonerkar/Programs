package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadColRowUsingItr {
	
	
	public  void ReadExcel() throws Throwable{
		 
		 File f = new File("C:\\New folder\\test1.xls");
		 FileInputStream fis = new FileInputStream(f);
		 HSSFWorkbook wb = new HSSFWorkbook(fis);
		 HSSFSheet sheet = wb.getSheet("data");
		 
		//ArrayList<String> list = new ArrayList<String>();
		 Iterator<Row> rowIterator = sheet.iterator(); // sh.rowIterator();
		 while(rowIterator.hasNext()){               
		     Row row = rowIterator.next();               
		     Iterator<Cell> cellIterator = row.iterator(); //row.cellIterator();              
		     while(cellIterator.hasNext()){                  
		         Cell cell = cellIterator.next();
		         System.out.print(cell.getStringCellValue()+"\t");
		     }
		                 System.out.println("");
		 }

		 }
			 
	 
	 public static void main(String[] args) throws Throwable {
		 ReadColRowUsingItr pe = new ReadColRowUsingItr();
		 pe.ReadExcel();
		 
	}

}
