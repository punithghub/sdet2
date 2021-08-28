package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		Dimension dimension = driver.manage().window().getSize();
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		System.out.println("search textfield is hidden dimension width: "+width);
		System.out.println("search textfield is hidden dimension height: "+height);
		
		Point position = driver.manage().window().getPosition();
		int Xaxics=position.getX();
		int Yaxics=position.getY();
		System.out.println("search textfield is hidden position Xaxics: "+Xaxics);
		System.out.println("search textfield is hidden position Yaxics: "+Yaxics);
		driver.manage().window().maximize();
		Thread .sleep(3000);
		driver.quit();

	}

}
