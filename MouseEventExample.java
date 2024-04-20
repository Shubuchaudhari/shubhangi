import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucky\\Documents\\Automation_Practicle\\Software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		WebElement flight =driver.findElement(By.linkText("Flight"));
		
		Actions action = new Actions(driver);
		
		//1.click and hold-it will perform
		//the mouse  left key operation and hold on given webelement
		
		//action.clickAndHold(flight).perform();
		
		//2. release-it will release the mouse of the given webelement
		//action.release().perform();
		
		//3.context click-it will use to right click of mouse at given at webelement
		//action.contextClick(flight).perform();
		
		
		

	}

}
