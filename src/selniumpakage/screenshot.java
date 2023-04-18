package selniumpakage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		try {
				System.out.println(driver.getTitle());
				
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
                Thread.sleep(3000);
              WebElement element = driver.findElement(By.linkText("PIM"));
               Actions action = new Actions(driver);
              action.moveToElement(element).perform();
              Thread.sleep(3000L);
      driver.findElement(By.linkText("Add Employee123")).click();
              Thread.sleep(4000);
              System.out.println("Clicked on submenu");                
      driver.findElement(By.linkText("L-ogout")).click();
      
      }
      catch(Exception e)                {
File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f1, new File("C:\\new floder screenshot\\screenshot floder new name.png"));
      }
      driver.quit();

}
}	


