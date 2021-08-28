package assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com");
		String cousre="python";
		driver.findElement(By.name("q")).sendKeys(cousre);
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@id,'u837-search-form-autocomplete')]"));
       
		//List<String> text=new ArrayList<String>();
		for(WebElement ele:links){
			String str=ele.getText();
			System.out.println(str);
			if(str.equalsIgnoreCase(cousre))
			{
				System.out.println("PASS::  course name is present in suggestion list");
			}else {
				System.out.println("Fail::  course name is not present in suggestion list");
			}
		}
		driver.quit();
	}

}
