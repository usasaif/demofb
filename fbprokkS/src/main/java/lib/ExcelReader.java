package lib;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	Sheet sh;
	public ExcelReader(String filename, 	String sheetname) throws IOException {
		
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new HSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
	}
	
	public Object[][] excelToArray(){
		
		//1 find out the no of rows and column from excel sheet.
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
		
		
		//2. define the size of the array[row][col]

		Object[][] x;
		x = new Object[totalRows-1][totalCols];
		
		//3. read the cell data from excel and store into the array.
		
		for(int r=1;r<totalRows;r=r+1) {
			for(int c=0;c<totalCols;c=c+1) {
				       // store into array         =  read cell data
					x[r-1][c] = getCellData(r,c);	
			}
		}
		return x;
	}
	
	public  String getCellData(int r, int c) {
		Cell cell = sh.getRow(r).getCell(c);
		
		String value = cell.getStringCellValue();
		return value;
		
		
	}
	
	
	
	
}
