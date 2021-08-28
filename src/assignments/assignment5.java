package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement UsernameTextField = driver.findElement(By.id("txtUsername"));
		UsernameTextField.clear();
		UsernameTextField.sendKeys("Admin");
		
		WebElement PasswordTextField = driver.findElement(By.id("txtPassword"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}

}
