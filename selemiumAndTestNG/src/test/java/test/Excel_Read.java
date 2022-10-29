package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel_Read {

	public static void main(String[] args) throws IOException {
		String path = "data/info.xls";
		FileInputStream obj = new FileInputStream(path);
		Workbook wb = new HSSFWorkbook(obj);
		Sheet sheet =wb.getSheet("sheet 2");
		
		for(Row i:sheet) {
			for(Cell j: i) {
				if(j.getCellType()==Cell.CELL_TYPE_STRING) {
					 String value=j.getStringCellValue();
					 System.out.println(value);
				}else if (j.getNumericCellValue()%1==0){
					int number =(int)j.getNumericCellValue();
					System.out.println(number);
					
				}else {
					double db =j.getNumericCellValue();
					System.out.println(db);
				}
				
				
			}
		}

	}

}
