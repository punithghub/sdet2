package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		WebElement Customcb=driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
		Thread.sleep(3000);
		if(! Customcb.isSelected())
		{
		System.out.println("PASS:: custom check box is not selected");
		}else {
		System.out.println("FAIL:: custom check box is selected");
		}
		
		Customcb.click();
		Thread.sleep(3000);
		if(Customcb.isSelected())
		{
			System.out.println("PASS:: custom check box is selected");
		}else {
			System.out.println("FAIL:: custom check box is not selected");
		}
		Thread.sleep(5000);
     	driver.quit();

	}

}
