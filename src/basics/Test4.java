package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//maimize the browser
		driver.manage().window().maximize();
		
	
		//minimize the browser
		driver.manage().window().minimize();
		
		//full the screen
		driver.manage().window().fullscreen();
	

	}

}
