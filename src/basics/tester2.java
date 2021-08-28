package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class tester2 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		
		System.out.println("expected title: "+expectedTitle);
		System.out.println("actual Title: "+actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass:: Login page is correct");
		}
		else
		{
			System.out.println("Fail:: Login pasge is incorrect");
		}
		
		String eurl="https://demo.actitime.com/login.do";
		String aurl=driver.getCurrentUrl();
		
		System.out.println("expected url: "+eurl);
		System.out.println("actual url: "+aurl);
		
		if(aurl.equals(eurl))
		{
			System.out.println("Pass:: Login url is correct");
		}
		else
		{
			System.out.println("Fail:: Login url is incorrect");
		}
		
		driver.close();

	}

}
