package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class HomePage {

    public static String home_page_title= "/html/body/div/div/div/div[1]/div/h1";

    public static void navigate_to_home_page() {
        BrowserDriver.driver.get("https://demo.realworld.io");
    }

    public static String home_feed_tag = ".tag-list a:first-child";

    public static String page_number_link = ".pagination li:nth-child(2) a";

    public static String get_home_page_title() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(home_page_title)).getText();
    }

    public static void click_home_feed_tag() throws InterruptedException {
        Thread.sleep(4000);
        BrowserDriver.driver.findElement(By.cssSelector(home_feed_tag)).click();
    }

    public static String get_home_feed_tag_name() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.cssSelector(home_feed_tag)).getText();
    }

    public static void click_page_number() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(page_number_link)));
        BrowserDriver.driver.findElement(By.cssSelector(page_number_link));
    }

    public static String get_page_number() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.cssSelector(page_number_link)).getText();
    }
}
