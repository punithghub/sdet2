package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://licindia.in/");
		
		String expectedTitle="Life Insurance Corporation of India - Home";
	    String actualTitle=driver.getTitle();
	    System.out.println("===============");
	    System.out.println("expectedTitle: "+expectedTitle);
	    System.out.println("actualTitle: "+actualTitle);
	    System.out.println("================");
	    if(expectedTitle.equals(actualTitle))
	    {
	    	System.out.println("Pass: webpage title is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage title is not correct");
	    }
	    
	    String expectedUrl="https://licindia.in/";
	    String actualUrl=driver.getCurrentUrl();
	    System.out.println("=================");
	    System.out.println("expectedUrl: "+expectedUrl);
	    System.out.println("actualUrl: "+actualUrl);
	    System.out.println("===================");
	    
	    if(expectedUrl.equals(actualUrl))
	    {
	    	System.out.println("Pass: webpage Url is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage Url is not correct");
	    }
	    
	    driver.navigate().to("https://licindia.in/Guidelines/Be-a-Corporate-Agent");
	    String expectedSubTitle="Life Insurance Corporation of India - Be a Corporate Agent";
	    String actualSubTitle=driver.getTitle();
	    
	    System.out.println("========================");
	    System.out.println("expectedSubTitle: "+expectedSubTitle);
	    System.out.println("actualSubTitle: "+actualSubTitle);
	    System.out.println("========================");
	    
	    if(expectedSubTitle.equals(actualSubTitle))
	    {
	    	System.out.println("Pass: webpage Sub title is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage Sub title is not correct");
	    }
	    
	    String expectedSubUrl="https://licindia.in/Guidelines/Be-a-Corporate-Agent";
	    String actualSubUrl=driver.getCurrentUrl();
	    
	    System.out.println("========================");
	    System.out.println("expectedSubUrl: "+expectedSubUrl);
	    System.out.println("actualSubUrl: "+actualSubUrl);
	    System.out.println("========================");
	    
	    if(expectedSubUrl.equals(actualSubUrl))
	    {
	    	System.out.println("Pass: webpage Sub Url is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage SUb Url is not correct");
	    }
	    
	    driver.navigate().back();
	    System.out.println("=====================");
	    System.out.println("came to prevoius page");
	    System.out.println("=====================");
	    
        String actualTitle1=driver.getTitle();
        System.out.println("============================");
        System.out.println("expected title: "+expectedTitle);
        System.out.println("Actual title: "+actualTitle1);
        System.out.println("============================");
 
	    if(expectedTitle.equals(actualTitle1))
	    {
	    	System.out.println("Pass: webpage title1 is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage title1 is not correct");
	    }
	    
	    driver.navigate().forward();
	    System.out.println("====================");
	    System.out.println("came to forward page");
	    System.out.println("====================");
	    
        String actualSubUrl1=driver.getCurrentUrl();
        System.out.println("============================");
	    System.out.println("expectedSubUrl: "+expectedSubUrl);
	    System.out.println("actualSubUrl1: "+actualSubUrl1);
	    System.out.println("============================");
	    if(expectedSubUrl.equals(actualSubUrl1))
	    {
	    	System.out.println("Pass: webpage Sub1 Url is correct");
	    }
	    else
	    {
	    	System.out.println("Fail: webpage SUb1 Url is not correct");
	    } 
	    
	    System.out.println("=================================");
	    System.out.println("going to close browser and server");
	    System.out.println("=================================");
		driver.quit();
	}

}
