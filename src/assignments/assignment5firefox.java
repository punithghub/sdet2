package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment5firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
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
