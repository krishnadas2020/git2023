package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PerameterizationTestingWith_ExcelReader {
WebDriver driver;
	
	@BeforeClass
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver","/users/krishnadas/downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
	}
	@Test(dataProvider="fb")
	public void testFB(String f,String l) {
		WebElement fName=driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.clear();
		fName.sendKeys(f);
		
		
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.clear();
		lname.sendKeys(l);

}
	@DataProvider
	public Object [][]dataFeeder() throws IOException{
		 
		Object [][]array;
		String path = "data/info.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook book = new HSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet 2");
		
		int totalRows =sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);
		int totalcols =sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(totalcols);
		
		
		array = new Object[totalRows-1][totalcols];// deduct one because of header row
		
		for(int row=1; row<totalRows; row++) {
			for(int col=0; col<totalcols; col++) {
				//array [row-1][col] = getCellData(row,col);
			}
		}
		
		return array;
			
	}
	
	
	
	
}