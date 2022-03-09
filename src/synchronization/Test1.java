package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
WebElement username = driver.findElement(By.name("username"));
w.until(ExpectedConditions.visibilityOf(username )).sendKeys("admin");
		
		

WebElement login = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]"));
w.until(ExpectedConditions.elementToBeClickable(login)).click();
	
	
		String title = driver.getTitle();
w.until(ExpectedConditions.titleContains("Instagram"));		
		
		
		System.out.println(title);

		if(title.equals("Instagram")){
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("fail:home page is not displayed");
		}

		System.out.println(driver.getCurrentUrl());

		
		driver.close();

	}

	}

}
