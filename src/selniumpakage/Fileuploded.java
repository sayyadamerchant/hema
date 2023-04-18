package selniumpakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploded {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
				System.out.println(driver.getTitle());
				
				driver.findElement(By.name("txtUserName")).sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login completed");
				 Thread.sleep(5000);
		            driver.switchTo().frame("rightMenu");
		            driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		            driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
		            driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
		             //To upload a file
		WebElement fileInput = driver.findElement(By.
		                      xpath("//input[@type='file'][@name='photofile']"));                                      
		fileInput.sendKeys("C:\\CorejavaComparator");
		//fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect Template.xlsx");
		            Thread.sleep(7000);
		            System.out.println("File uploaded successfully");            
		            driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		            Thread.sleep(9000);
		              System.out.println("New Employee Added");
		              driver.switchTo().defaultContent();
		              driver.findElement(By.linkText("Logout")).click();
		              driver.close();
		               
		        }
		}
	


