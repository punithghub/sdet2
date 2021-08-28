package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		WebElement Malecb=driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
		Thread.sleep(3000);
		if(! Malecb.isSelected())
		{
		System.out.println("PASS:: Male check box is not selected");
		}else {
		System.out.println("FAIL:: Male check box is selected");
		}
		
		Malecb.click();
		Thread.sleep(3000);
		if(Malecb.isSelected())
		{
			System.out.println("PASS:: Male check box is selected");
		}else {
			System.out.println("FAIL:: Male check box is not selected");
		}
		Thread.sleep(5000);
 	driver.quit();

	}

}
