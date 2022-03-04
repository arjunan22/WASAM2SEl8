package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");


//back
driver.navigate().back();


//forward
driver.navigate().forward();


//refresh
driver.navigate().refresh();


driver.close();


	}

}
