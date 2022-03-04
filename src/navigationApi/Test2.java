package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");


driver.navigate().to("https://www.facebook.com/");

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();

Thread.sleep(3000);
driver.close();






	}

}
