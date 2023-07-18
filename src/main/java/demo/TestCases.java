package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
// //Selenium Imports
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.remote.BrowserType;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com/");
        System.out.println("end Test case: testCase01");
    }

    public  void TC_CountHyperlinks(){
        System.out.println("Start Test case: TC_CountHyperlinks");
        // Load the Url  "https://in.bookmyshow.com/explore/home/chennai"
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Locate links present on the page Using Locator "XPath" "//a"
        List<WebElement> eleListCount = driver.findElements(By.xpath("//a"));
        // Print the count of the links 
        System.out.println("total Counts: "+ eleListCount.size());
        System.out.println("end Test case: TC_CountHyperlinks");
    }
}
