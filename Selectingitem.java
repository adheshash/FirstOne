package amaz;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectingitem extends Basic {
	
	@Test
	public void Item() {
		
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList-nav-line-1\']")).click();
		WebElement id=	driver.findElement(By.name("email"));
		id.sendKeys("9677146326"+Keys.ENTER);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("adhesh@123"+Keys.ENTER);
		
		
		//searching item 
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("redmi note 11");
		WebElement startsearch=driver.findElement(By.id("nav-search-submit-button"));
		startsearch.click();
	String oldwindow=	driver.getWindowHandle();
		
		//selecting mobile
		WebElement mobile=driver.findElement(By.partialLinkText("Redmi Note 11 (Starburst White, 4GB RAM, 64GB Storage"));
		mobile.click();
		Set<String> handles	=driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement cart=driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\'attach-sidesheet-view-cart-button\']/span/input"));
		confirm.click();
		
		driver.close();
		
	driver.switchTo().window(oldwindow);
		
		
		
		
		}

		
	}


