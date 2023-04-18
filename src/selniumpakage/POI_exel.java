package selniumpakage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_exel {

	public static void main(String[] args) throws Exception 
	{
		 FileInputStream fileinput = new FileInputStream("F:\\newexelfile.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		    XSSFSheet sheet = workbook.getSheet("Sheet1");
		    System.out.println(sheet.getSheetName());
		    System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data "+
		                                      sheet.getRow(2).getCell(1));
		    // Write the data to excel file
		    XSSFCell cell =  sheet.getRow(2).getCell(1);
		    cell.setCellValue("sayyada");// edit hota hai
		    fileinput.close();
		    
		    FileOutputStream fileOut = new FileOutputStream("F:\\newexelfile.xlsx");
		    workbook.write(fileOut);
		    System.out.println("Updated data after write is done " + cell.getStringCellValue());
		    fileOut.close();
		   
		}


	}


