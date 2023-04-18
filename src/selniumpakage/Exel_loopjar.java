package selniumpakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exel_loopjar {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream file = new FileInputStream("F:\\sayyadadata.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		int rowcount=st.getRows();
		System.out.println(rowcount);// 4 
		for(int i=0;i<rowcount;i++) {
		String empid = st.getCell(0,i).getContents();//(0,0)(0,1)
		String name = st.getCell(1,i).getContents();  //(1,0)(1,1)
		String email = st.getCell(2,i).getContents(); //(2,0)(2,1)
		String no = st.getCell(3,i).getContents();//(3,0)(3,1)
		

		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
		}


	}

}
