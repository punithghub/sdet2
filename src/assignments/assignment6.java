package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(3000);
		if(!checkbox.isSelected())
		{
			System.out.println("PASS:: check box is not selected");
		}else {
			System.out.println("FAIL:: check box is selected");
		}
		
		checkbox.click();
		Thread.sleep(3000);
		if(checkbox.isSelected())
		{
			System.out.println("PASS:: check box is selected");
		}else {
			System.out.println("FAIL:: check box is not selected");
		}
		Thread.sleep(5000);
 	driver.quit();
	}

}
