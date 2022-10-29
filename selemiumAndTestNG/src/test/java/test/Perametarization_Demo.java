package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Perametarization_Demo {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/users/krishnadas/downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	@Test(dataProvider="fb")
	public void  fbTest(String f,String l,String e,String password) {
		
		WebElement fName=driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.clear();
		fName.sendKeys(f);
		
		
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.clear();
		lname.sendKeys(l);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.clear();
		email.sendKeys(e);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pass.clear();
	  pass.sendKeys(password);
		
	}
	
	@DataProvider(name="fb")
	public Object[][]getdata() throws IOException{
		Object [][]t;
		String filename="data/info.xls";
		String sheetname= "sheet 2";
		Excel_ReadClass2 obj = new Excel_ReadClass2(filename, sheetname);
		t = obj.excelToArray();
		
		
		
		return t;
		
		
		
//		Object[][]obj= {  {"krishna","das","dask2345@yahoo.com","pas8989"}, 
//				          {"kabbo","dash","dash5432@gmail.com","pass5656"},
//				          {"kabbo0","dashe","dash54325@gmail.com","paess5656"},
//				          };
//		
//		return obj;
//		
		
		
			}

}
