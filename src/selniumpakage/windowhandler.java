package selniumpakage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();

		//1st wind
		driver.get("file:///C:/Users/HP/Downloads/multiplewindows.html");
		Thread.sleep(3000);
		//2nd Wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(2));
		Thread.sleep(3000);
		//driver.close(); //to close current/active browser
		driver.quit();//to close all browsers opened by webdriver instance

				
				

	}

}
