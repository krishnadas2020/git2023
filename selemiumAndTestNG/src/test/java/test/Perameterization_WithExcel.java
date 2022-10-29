package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Perameterization_WithExcel {
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
	@DataProvider(name="fb")
	public Object[][]getdata() throws IOException{
		Object [][]t;
		String filename="data/info.xls";
		String sheetname= "sheet 2";
		Excel_ReadClass2 obj = new Excel_ReadClass2(filename, sheetname);
		t = obj.excelToArray();
		
		
		
		return t;
		
	}
	
	
}
