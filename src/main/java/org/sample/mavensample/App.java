package org.sample.mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class App 
{

	public static void main(String[] args) {

		// below I'm telling Selenium about chromedriver location 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\future\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		// creating an instance from chrome driver
		WebDriver driver = new ChromeDriver();
    	
		// below is the url to be opened
        String googleUrl = "https://www.google.com/";
       // String facebookUrl = "https://www.facebook.com/";

        // below I'm using the driver to open the web page related to the url above 
        driver.get(googleUrl);
        
        // below I added time delay such that after 3 seconds from opening google, facebook page will be opened  
        try {
            Thread.sleep(3000);  // 3 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // driver.get(facebookUrl);
      
        //driver.quit();
    }

}