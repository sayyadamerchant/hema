package selniumpakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exel {

	public static void main(String[] args) throws BiffException, IOException {
		
		
				FileInputStream file = new FileInputStream("D:\\Book1.xls");
				Workbook wb = Workbook.getWorkbook(file);
				Sheet st = wb.getSheet(0);
				int row = 3;
				String empid = st.getCell(0,0).getContents();
				String name = st.getCell(1,1).getContents();
				String email = st.getCell(2,2).getContents();
				String no = st.getCell(3,row).getContents();

				System.out.println(empid);
				System.out.println(name);
				System.out.println(email);
				System.out.println(no);

	}

}
