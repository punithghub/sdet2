package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class hai {
public static void main(String[] args )
{
	String key="webdriver.chrome.driver";
	String value="D:\\java selenium\\software\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver c=new ChromeDriver();
	c.get("https://www.facebook.com");
	c.quit();
	//System.out.println("hai to everyone");
	}
}
