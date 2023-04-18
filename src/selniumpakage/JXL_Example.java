package selniumpakage;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class JXL_Example {

public static void main(String[] args) {
		FileInputStream file = new FileInputStream(‪"C:\\Users\\HP\\OneDrive\\Documents\\TestData.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("Sheet1");
		int row = 3;
		String empid = st.getCell(0,row).getContents();
		String name = st.getCell(1,row).getContents();
		String email = st.getCell(2,row).getContents();
		String no = st.getCell(3,row).getContents();

		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);

	}
}
