package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import zmq.socket.reqrep.Rep;

public class Testcase1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test
	public void tc1() {
	driver.findElement(By.id("email")).sendKeys("admin");	
	driver.findElement(By.id("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title,true);
	
//	//synatx for assert
//	Assert.assertEquals(actual, expected);
	
	//example for assert
	Assert.assertEquals(title,"Facebook � log in or sign up");
//	
//	//syntax for softassert
//	SoftAssert a=new SoftAssert();
//	a.assertEquals(actual, expected);
//	
//	
//	SoftAssert a=new SoftAssert();
//	a.assertEquals(title,"yuegcvgddgdhg");
	
	
	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	//a.assertAll();
	
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	

}
