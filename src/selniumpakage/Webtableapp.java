package selniumpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/WebTable.html");
		//Count
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();// 7 row in table
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();// 4 clm in table
		int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size(); // 7*4 =28 row and colum

		System.out.println(row);// 7 row
		System.out.println(col);// 4 clm
		System.out.println(row_col);// 28 (row &clm)
		//Data--Cell
		String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata); // cell data in first colm
		//Data--Table
		//  DT var VV
		for(int i=1; i<=row;i++) {
		String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		System.out.println(data);// cell data using for loop all data print
		Thread.sleep(3000);
		}

		driver.close();



	}

}
