package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value ="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		String expectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(expectedTitle);
		
		if(expectedTitle.equals(title))
			System.out.println("Pass: title is present");
		else
			System.out.println("Fail: Title is not present");
		
		String expectedurl="https://www.myntra.com/";
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(expectedurl);
		
		if(expectedurl.equals(url))
			System.out.println("Pass: Url is present");
		else
			System.out.println("Fail: Url is not present");
		
		driver.close();
	}

}
