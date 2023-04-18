package selniumpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
				System.out.println(driver.getTitle());
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
	
	driver.switchTo().frame("rightMenu");
	for(int i=1; i<=20; i=i+2) {
	driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();        
	System.out.println("Clicked on Checkbox of " + i);
	Thread.sleep(3000);
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}