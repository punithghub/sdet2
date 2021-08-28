package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class tester1 {

	public static void main(String[] args) {
		String key="webdriver.edge.driver";
		String value="./drivers/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close(); 

	}

}
