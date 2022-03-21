package sceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step:1 typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//step:2 we can access the method photo is taken and stored in RAM
		File ramloc = ts.getScreenshotAs(OutputType.FILE);
		
		//step:3 we need to specify the location
		File destloc=new File("./photo/amazon.png");
		
		//Step:4 copy from RAM TO Required location
		FileUtils.copyFile(ramloc, destloc);
		
		
		driver.close();
		
		
		
	}

}
