package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class UserFeedPage {
    public static String your_feed_page = "/html/body/div/div/div/div[2]/div/div[1]/div/ul/li[1]/a";
    public static String global_feed_link = "/html/body/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a";
    public static String favourite_button_link_home_feed = "/html/body/div/div/div/div[2]/div/div[1]/article-list/article-preview[1]/div/article-meta/div/ng-transclude/favorite-btn";

    public static String get_user_feed_page() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(your_feed_page)).getText();
    }

    public static void click_global_feed_link() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(global_feed_link)).click();
    }

    public static void click_favourite_button_link_home_feed() throws InterruptedException {
        Thread.sleep(4000);
        BrowserDriver.driver.findElement(By.xpath(favourite_button_link_home_feed)).click();
    }
}
