package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class AuthorPage {
    public static String global_feed_author_name_link = "/html/body/div/div/div/div[2]/div/div[1]/article-list/article-preview[1]/div/article-meta/div/div/a";

    public static String authors_name = "/html/body/div/div/div/div[1]/div/div/div/h4";
    public static void click_authors_name() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(global_feed_author_name_link)).click();
        Thread.sleep(2000);
    }

    public static String get_authors_name() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(authors_name)).getText();
    }
}
