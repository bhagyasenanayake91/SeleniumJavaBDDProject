package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory","jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\IdeaProjects\\SeleniumJavaBDDProject\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://demo.realworld.io");

    }

    public void close(){
        driver.close();
    }

}
