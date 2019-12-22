package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {


	public void tc() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		ArrayList<String> userName = ReadExcelData(0);
		ArrayList<String> userPwd = ReadExcelData(1);
		
		for(int i=0; i<userName.size(); i++){
			driver.findElement(By.id("email")).sendKeys(userName.get(i));
			driver.findElement(By.id("pass")).sendKeys(userPwd.get(i));
			driver.findElement(By.id("u_0_2")).click();
			
			
		}
	}

	public ArrayList<String> ReadExcelData(int colNo) throws Throwable{
		
		File f = new File("C:\\New folder\\test1.xls");		
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("data");

		Iterator<Row> rowIterator = sheet.iterator();
		
		ArrayList<String>list = new ArrayList<String>();
		
		while(rowIterator.hasNext()){
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());
			}
		System.out.println(list);
		return list;
		}
	

	public static void main(String[] args) throws Throwable {
		
		ReadData rd = new ReadData();
		
		rd.tc();
		
	}
}
