package pratice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String astr="skill";
		driver.findElement(By.name("q")).sendKeys(astr);
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//li[contains(@class,'sbct')and not (@id)]"));
		
	   for(WebElement ele:links){
			String str=ele.getText();
			if(str.startsWith(astr))
			{
				System.out.println("Pass:: autosuggestion starts with search keyword");
			}else {
				System.out.println("Fail:: autosuggestion not starts with search keyword");
			}
		}
		driver.quit();
	}

}
