package selniumpakage;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropanddownvalue {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
				System.out.println(driver.getTitle());
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
				driver.switchTo().frame("rightMenu");
				//dropdown values
				
				Select st = new Select(driver.findElement(By.name("loc_code")));
				List<WebElement> drpvalues=st.getOptions();
				
				for(WebElement val:drpvalues) {
				        System.out.println(val.getText());
				        Thread.sleep(3000);
				}
				driver.switchTo().defaultContent();
				driver.findElement(By.linkText("Logout")).click();
				driver.close();

				        }
				

	}


