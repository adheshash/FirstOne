package amaz;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basic {

	
WebDriver driver;
@BeforeMethod
public void setup() {
	System.setProperty("WebDriver.chrome.driver", "D:\\testing\\driver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
}

@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
}
