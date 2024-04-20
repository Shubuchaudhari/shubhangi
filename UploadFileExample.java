import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucky\\Documents\\Automation_Practicle\\Software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("Z:\\myPPT\\automation\\Action Class.docx");
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	

}
