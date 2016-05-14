package sampleGooglePackage.sampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleGoogleLauncherTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void beforMethod()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void testMethod()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("Jenkins-ci.org");
		driver.findElement(By.linkText("Jenkins")).click();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit(); 
		
	}

}
