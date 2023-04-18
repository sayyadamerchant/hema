package selniumpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
				System.out.println(driver.getTitle());
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
				Thread.sleep(4000);
				//Enter into frame
				driver.switchTo().frame("rightMenu");
				driver.findElement(By.xpath("//input[@value ='Add']")).click();
						
				Thread.sleep(3000);
				System.out.println("CLicked on Add btn");
				driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
				driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
				driver.findElement(By.id("btnEdit")).click();
				Thread.sleep(3000);
				System.out.println("New emp added");
				//Exit from frame
				driver.switchTo().defaultContent();
				driver.findElement(By.linkText("Logout")).click();
				driver.close();



	}

}
