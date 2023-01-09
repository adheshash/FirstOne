package amaz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logintest extends Basic{
	
	
	@Test(priority=0)
	//positive test
	public void login() {
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList-nav-line-1\']")).click();
		WebElement id=	driver.findElement(By.name("email"));
		id.sendKeys("9677146326"+Keys.ENTER);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("adhesh@123"+Keys.ENTER);

	}

	@Test(priority=1)
	//negative test
	public void negativelogin() {
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList-nav-line-1\']")).click();
		WebElement id=	driver.findElement(By.name("email"));
		id.sendKeys("9677146326"+Keys.ENTER);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("wrongpassword"+Keys.ENTER);


		String actualMsg = driver.findElement(By.xpath("//*[@id=\'auth-error-message-box\']")).getText();
		System.out.println("actual Msg :"+actualMsg);

	}
	@Test(priority=2)
	//forget password
	public void forgetpassword() {
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList-nav-line-1\']")).click();
		WebElement id=	driver.findElement(By.name("email"));
		id.sendKeys("9677146326"+Keys.ENTER);
		WebElement forget=driver.findElement(By.id("auth-fpp-link-bottom"));
		forget.click();
		String msg=	driver.findElement(By.xpath("//*[@id=\'authportal-main-section\']/div[2]/div/div[1]/div/form/p")).getText();
		System.out.print("massage for genearting otp: "+msg);
		WebElement forotp=driver.findElement(By.id("continue"));
		forotp.click();
		String otp=driver.findElement(By.xpath("//*[@id=\'verification-code-form\']/div[4]/div[1]/h1")).getText();
		System.out.print("otp massage:"+otp);

	}
	
	

}
