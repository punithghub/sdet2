package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class opera {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
		WebDriver driver=new OperaDriver();
	}

}
