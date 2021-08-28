package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class assi1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		String courseName = "Data Science";
		driver.findElement(By.name("q")).sendKeys(courseName);
		Thread.sleep(5000);

		List<WebElement> autoSuggestionList = driver.findElements(By.xpath("//a[contains(@id,'search-form-autocomplete')]"));
		for(WebElement ele:autoSuggestionList) {
			String str=ele.getText();
			if(str.equalsIgnoreCase(courseName)) {
				System.out.println("PASS : Entered course name is present in suggestion list");
				break;
			}else {
				System.out.println("FAIL : Entered course name is not present in suggestion list");
				break;
			}
		}
		driver.quit();


	}

}
