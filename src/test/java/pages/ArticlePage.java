package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.util.List;

public class ArticlePage {
    public static String article_list = "//span[@class='ng-scope ng-isolate-scope']";
    public static String favourite_article_link = "/html/body/div/div/div/div[1]/div/article-actions/article-meta/div/ng-transclude/span[2]/favorite-btn/button";
    public static String article_title = "/html/body/div/div/div/div[1]/div/h1";
    public static int article_list_size() throws InterruptedException {
        Thread.sleep(3000);
        int count;
        List<WebElement> myTagsWithId = BrowserDriver.driver.findElements(By.cssSelector(".article-preview:not(.ng-hide)"));
        return count = myTagsWithId.size();
    }

    public static String get_article_title_name() throws InterruptedException {
        Thread.sleep(4000);
        String post_name = BrowserDriver.driver.findElement(By.xpath(article_title)).getText();
        System.out.println("ARTICLE NAME: "+post_name);
        return BrowserDriver.driver.findElement(By.xpath(article_title)).getText();
    }

    public static void click_favourite_article() throws InterruptedException {
        Thread.sleep(4000);
        BrowserDriver.driver.findElement(By.xpath(favourite_article_link)).click();
    }
}
