package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement ele = driver.findElement(By.id("MTR"));
Select s=new Select(ele);
s.selectByIndex(0);
s.selectByValue("m");
s.selectByVisibleText("Cake");

WebElement option = s.getFirstSelectedOption();
System.out.println(option.getText());

List<WebElement> alloptions = s.getAllSelectedOptions();

for(WebElement op:alloptions) {
	System.out.println(op.getText());
}

driver.close();
	}

}
