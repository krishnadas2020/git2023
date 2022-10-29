package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Perametrization_Test1 {
	WebDriver driver;
	
//	@BeforeClass
//	public void setup_test() {
//		
//		
//	}
 	
	
	@Test(dataProvider="dp")
	public void fbtitiletest(String f,String l,String e,String ee,String p) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
		WebElement fName =driver.findElement(By.xpath("//input[@name='firstname']"));
              fName.clear();
            fName.sendKeys(f);
             
       WebElement lName =driver.findElement(By.xpath("//input[@name='lastname']"));
       lName.clear();
           lName.sendKeys(l) ; 
           
           WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
           email.clear();
           email.sendKeys(e);
           
           WebElement email2=driver.findElement(By.xpath("//input[@name='reg_email__']"));
           email2.clear();
           email2.sendKeys(ee);
           
           
           WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
           pass.clear();
           pass.sendKeys(p);
	}	
	
	
	@DataProvider(name="dp")
	public Object[][]getData(){
		
		Object [][] t= { {"krishna","das","daskrisb@yahoo.com","daskrisb@yahoo.com","kdas234"},
				          {"ali","jon","alidas4536@yahh.com","alidas4536@yahh.com","ali54673"},
				        {"das","krish","kddas2345@gmail.com","kddas2345@gmail.com","dk7899"} };
						
	return t;
}
}