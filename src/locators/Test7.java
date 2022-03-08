package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("qwerty");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("23465789");
driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]")).click();

String title = driver.getTitle();
System.out.println(title);

if(title.equals("Instagram")){
	System.out.println("Pass:home page is dispalyed");
}
else
{
	System.out.println("fail:home page is not displayed");
}

System.out.println(driver.getCurrentUrl());

Thread.sleep(3000);
driver.close();

	}

}
