package selniumpakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitstatment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
				System.out.println(driver.getTitle());
				
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				//driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
				//wait until Login btn need to be loaded
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.
				                elementToBeClickable(driver.findElement(By.name("Submit"))));
				driver.findElement(By.name("Submit")).click();
				//wait unti empInfo: page to be loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				System.out.println("Login completed");
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(4000);
				System.out.println("Logout completed");
				driver.close();
	}

}
