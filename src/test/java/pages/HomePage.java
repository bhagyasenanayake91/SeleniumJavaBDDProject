package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage {

    public static String home_page_title= "/html/body/div/div/div/div[1]/div/h1";

    public static void navigate_to_home_page() {
        BrowserDriver.driver.get("https://demo.realworld.io");
    }

    public static String get_home_page_title() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(home_page_title)).getText();
    }
}
