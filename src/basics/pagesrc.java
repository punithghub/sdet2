package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesrc {
	
	public static void main(String [] args)
	{
	String key="webdriver.chrome.driver";
	String value="./drivers/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	
	String etext="Please identify yourself";
	String src=driver.getPageSource();
	if(src.contains(etext))
		System.out.println("present");
	else
		System.out.println("not present");
	
	System.out.println(src);
	driver.close(); 
	}
}
