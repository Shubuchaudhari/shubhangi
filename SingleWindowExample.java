import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucky\\Documents\\Automation_Practicle\\Software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//getwindowhanlde method will store the unique session id of opened window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwiwindow1 = i.next();
			System.out.println(childwiwindow1);
			if(!parentWindow.equalsIgnoreCase(childwiwindow1))
			{
				driver.switchTo().window(childwiwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();			
			}
		}
		driver.switchTo().window(parentWindow);
		
	}

}
