package selniumpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasicprogram {

	public static void main(String[] args) {
	System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://mail.google.com");
	driver.close();

	}

}
