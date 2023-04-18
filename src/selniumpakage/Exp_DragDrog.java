package selniumpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class Exp_DragDrog {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable");
				Thread.sleep(3000);
				//Verify Title--cond fail - stop exe
			assertEquals(driver.getTitle(),"Droppable | jQuery UI");//tile math hona chayiye
			
				System.out.println("Title matched");
				Thread.sleep(3000);
				driver.switchTo().frame(0);//frame index value 0 liye
				Actions ac = new Actions(driver); // perform ke liye
				ac.dragAndDrop(driver.findElement(By.id("draggable")), 
				                       driver.findElement(By.id("droppable"))).perform();
				System.out.println("Drag&Drop");
				Thread.sleep(4000);
				driver.switchTo().defaultContent();
				driver.close();
				}
				

		


	}


