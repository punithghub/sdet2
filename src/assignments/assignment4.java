package assignments;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.opera.OperaDriver;


public class assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
		myntra.test(new ChromeDriver());
		myntra.test(new FirefoxDriver());
		myntra.test(new EdgeDriver());
		//myntra.test(new OperaDriver());
		

	}

}
