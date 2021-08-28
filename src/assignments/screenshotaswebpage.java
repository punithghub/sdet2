package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotaswebpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		String timeStamp = LocalDateTime.now().toString().replace(":","-");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Stop")).click();
		Thread.sleep(10000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	     File tempfile = ts.getScreenshotAs(OutputType.FILE);
	     File destfile=new File("./errorshot/naukariwebpage"+timeStamp+".png");
	     FileUtils.copyFile(tempfile, destfile);
	     
       driver.quit();

	}

}
