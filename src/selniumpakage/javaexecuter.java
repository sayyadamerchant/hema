package selniumpakage;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaexecuter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println(driver.getTitle());
       driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
       driver.findElement(By.name("txtPassword")).sendKeys("admin");
        //using javascriptExecuter to click on login btn
   WebElement loginbtn = driver.findElement(By.name("Submit"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", loginbtn);
        Thread.sleep(4000);
        System.out.println("Login completed");
       // using javascriptExecuter to click on logout btn
WebElement logout = driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1 = (JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();", logout);
            System.out.println("Logout completed");
        driver.close();
      }

	}


