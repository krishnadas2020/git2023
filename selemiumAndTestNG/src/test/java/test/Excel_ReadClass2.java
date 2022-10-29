package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel_ReadClass2 {
	Sheet sh;

	public Excel_ReadClass2(String filename, String sheetname) throws IOException {

		FileInputStream obj = new FileInputStream(filename);
		Workbook wb = new HSSFWorkbook(obj);
		sh = wb.getSheet(sheetname);

	}

	public Object[][] excelToArray() {
		Object[][] t;// daclare
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalcols = sh.getRow(0).getPhysicalNumberOfCells();
		t = new Object[totalRows - 1][totalcols];

		for (int row = 1; row < totalRows; row++) {
			for (int col = 0; col < totalcols; col++) {
				Cell c = sh.getRow(row).getCell(col);

				String value = "";
				if (c.getCellType() == Cell.CELL_TYPE_STRING) {
					value = c.getStringCellValue();

				}

				else {
					if (c.getNumericCellValue() % 1 == 0) {
						value = "" + (int) c.getNumericCellValue();

					} else {
						value = "" + c.getNumericCellValue();

					}

				}

				t[row - 1][col] = value;// after the loop we initialize 

			}

		}
		return t;
	}
}
