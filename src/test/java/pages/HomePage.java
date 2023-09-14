package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class HomePage {

    public static String home_page_title= "/html/body/div/div/div/div[1]/div/h1";
    public static String sign_in_page_link= "/html/body/div/app-header/nav/div/ul[1]/li[2]/a";
    public static String registration_link = "/html/body/div/app-header/nav/div/ul[1]/li[3]/a";

    public static String home_feed_tag = ".tag-list a:first-child";
    public static String page_number_link = ".pagination li:nth-child(2) a";

    public static String article_link = "/html/body/div/div/div/div[2]/div/div[1]/article-list/article-preview[1]/div/a";

    public static void navigate_to_home_page() {
        BrowserDriver.driver.get("https://demo.realworld.io");
    }
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

    public static void click_sign_in_link() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(sign_in_page_link)).click();
    }

    public static void click_registration_link() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(registration_link)).click();
    }

    public static void click_article_on_homepage() throws InterruptedException {
        Thread.sleep(4000);
        BrowserDriver.driver.findElement(By.xpath(article_link)).click();
    }
}
