package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxCommandContext;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test3 {

	public static void main(String[] args) {
		//firefox
FirefoxOptions option=new FirefoxOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new FirefoxDriver(option);


//chrome
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver driver1=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
