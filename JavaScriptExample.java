import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucky\\Documents\\Automation_Practicle\\Software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1.firstly we need refrence variable of javascript excuter interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2.in javascript excuter interface we have 2 method excuterscript and excuteasyncscript
		
		driver.findElement(By.name("uid")).sendKeys("shubhangi");
		driver.findElement(By.name("password")).sendKeys("shubhangi123");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		//we will use belo javascript to click on login button.
		js.executeScript("arguments[0].click();", login);
		
		//
		js.executeScript("alert('user or password is not valid);");
				
		

	}

}
