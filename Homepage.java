package amaz;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage  extends Basic{

	@Test
	public void verify() {
		//title
		String actualresult=driver.getTitle();
		String exceptedresult="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualresult, exceptedresult);
		//logo
		boolean image=	driver.findElement(By.xpath("//*[@id=\'nav-logo-sprites\']")).isDisplayed();
		Assert.assertTrue(image);
		
	}
	
	
	
}
