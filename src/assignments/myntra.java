package assignments;

import org.openqa.selenium.WebDriver;

public class myntra {
	
	public static void test(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String expectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass:: Title is correct");
		}
		else
		{
			System.out.println("Fail:: Title is incorrect");
		}
		
		String expectedUrl="https://www.myntra.com/";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Pass:: URl is correct");
		}
		else
		{
			System.out.println("Fail:: Url is incorrect");
		}
		
        driver.quit();		
	}

	
}
