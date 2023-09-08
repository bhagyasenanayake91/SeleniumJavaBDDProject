package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.util.List;

public class ArticlePage {
    public static String article_list = "//span[@class='ng-scope ng-isolate-scope']";


    public static int article_list_size() throws InterruptedException {
        Thread.sleep(3000);
        int count;
        List<WebElement> myTagsWithId = BrowserDriver.driver.findElements(By.cssSelector(".article-preview:not(.ng-hide)"));
        return count = myTagsWithId.size();
    }

}
