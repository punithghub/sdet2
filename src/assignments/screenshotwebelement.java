package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotwebelement {

	public static void main(String[] args) throws IOException, InterruptedException {
		String timeStamp = LocalDateTime.now().toString().replace(":","-");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	     File tempfile = driver.findElement(By.id("whiteBoxWithLogo")).getScreenshotAs(OutputType.FILE);
	     File destfile=new File("./errorshot/actitimeloginconsole"+timeStamp+".png");
	     FileUtils.copyFile(tempfile, destfile);
	     Thread.sleep(5000);
       driver.quit();
	}

}
