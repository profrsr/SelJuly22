package readExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class WriteExcel {

	@Test
	public void writeExcel() throws IOException, InvalidFormatException{

		
		//	Create a new work (Using XSSFWorkbook)
		XSSFWorkbook wbook = new XSSFWorkbook();

		//	create sheet using name or index (XSSFSheet -> createSheet)
		XSSFSheet sheet = wbook.createSheet("TestLeaf");

	
		//	Write the contents of the cell (setCellValue)
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		//Write the Value
		cell.setCellValue("WelCome to TestLeaf");
		
		XSSFCell cell1 = row.createCell(1);
		
		//Write the Value
		cell1.setCellValue(12345);
		
		//Create the .xlsx file
		File output = new File("./data/Report.xlsx");		
		FileOutputStream fos = new FileOutputStream(output);
		
		// Save the workbook
		wbook.write(fos);		
		
		//Close the workbook		
		wbook.close();
		
		//close FileOutoutStream
		fos.close();
		
	}
	
}