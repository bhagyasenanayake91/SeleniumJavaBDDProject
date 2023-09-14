package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage {
    public static String username_textbox = "/html/body/div/div/div/div/div/div/form/fieldset/fieldset[2]/input";
    public static String password_textbox = "/html/body/div/div/div/div/div/div/form/fieldset/fieldset[3]/input";
    public static String sign_in_button = "/html/body/div/div/div/div/div/div/form/fieldset/button";
    public static String username= "bddtestuser01@test.com";
    public static String password= "testing123";
    public static String login_error_message = "/html/body/div/div/div/div/div/div/list-errors";


    public static void login_with_valid_credentials() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(username_textbox)).sendKeys(username);
        BrowserDriver.driver.findElement(By.xpath(password_textbox)).sendKeys(password);
        BrowserDriver.driver.findElement(By.xpath(sign_in_button)).click();
    }

    public static void login_with_invalid_credentials() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(username_textbox)).sendKeys("satest@test.com");
        BrowserDriver.driver.findElement(By.xpath(password_textbox)).sendKeys("123test");
        BrowserDriver.driver.findElement(By.xpath(sign_in_button)).click();
    }

    public static String get_invalid_login_error_message() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(login_error_message)).getText();
    }
}
