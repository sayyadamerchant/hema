package selniumpakage;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;


public class newexelprojrct {

public static void main(String[] args) throws Exception {
		//FileInputStream file = new FileInputStream(‪"C:\\Users\\HP\\OneDrive\\Documents\\TestData.xls");
	FileInputStream file = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\sayyadadata.xls");
	Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		//int row = 0;
		
		String empid = st.getCell(0,1).getContents(); //(0,3)
		String name = st.getCell(1,1).getContents(); //(1,3)
		String email = st.getCell(2,1).getContents(); //(2,3)
		String no = st.getCell(3,1).getContents(); //(3,3)

		System.out.println(empid);
		System.out.println(name);             
		System.out.println(email);                                       
		System.out.println(no);          
// (3 rd pura table print hoga)          
	}

}
