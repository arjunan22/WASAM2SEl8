package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement serachtextbox = driver.findElement(By.name("q"));
Point loc = serachtextbox.getLocation();
System.out.println(loc.getX());
System.out.println(loc.getY());

driver.close();
	
	}

}

