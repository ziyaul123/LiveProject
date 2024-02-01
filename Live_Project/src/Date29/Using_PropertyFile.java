package Date29;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_PropertyFile 
{
	WebDriver driver;
	Properties conpro;
	@BeforeTest
	public void setUp()throws Throwable
	{
		conpro = new Properties();
		conpro.load(new FileInputStream("Login.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(conpro.getProperty("url"));
	}
	@Test
	public void startTest() 
	{
		driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys(conpro.getProperty("Enteruser"));
		driver.findElement(By.xpath(conpro.getProperty("objpass"))).sendKeys(conpro.getProperty("Enterpass"));
		driver.findElement(By.xpath(conpro.getProperty("objLogin"))).sendKeys(Keys.ENTER);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected)) 
		{
			Reporter.log("Username and Password are Valid::"+Expected+"  "+Actual,true);
		}
		else 
		{
			String Error_massege = driver.findElement(By.xpath(conpro.getProperty("objError"))).getText();
			Reporter.log(Error_massege+"  "+Expected+"     "+Actual);
		}
	}
	@Test
	public void tearDown() 
	{
		driver.quit();
	}

}
