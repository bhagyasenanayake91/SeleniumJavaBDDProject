package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistrationPage {
    public static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    public static String username_textbox = "/html/body/div/div/div/div/div/div/form/fieldset/fieldset[1]/input";
    public static String email_textbox = "/html/body/div/div/div/div/div/div/form/fieldset/fieldset[2]/input";
    public static String password_textbox = "/html/body/div/div/div/div/div/div/form/fieldset/fieldset[3]/input";
    public static String sign_up_button = "/html/body/div/div/div/div/div/div/form/fieldset/button";
    public static String username = "testuser"+timeStamp;
    public static String email = username+"@test.com";
    public static String password = "testing123";
    public static String sign_up_page_heading = "/html/body/div/div/div/div/div/div/h1";
    public static void submit_registration_details() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(username_textbox)).sendKeys(username);
        BrowserDriver.driver.findElement(By.xpath(email_textbox)).sendKeys(email);
        BrowserDriver.driver.findElement(By.xpath(password_textbox)).sendKeys(password);
        BrowserDriver.driver.findElement(By.xpath(sign_up_button)).click();
    }
    public static String get_sign_up_page_heading_text() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserDriver.driver.findElement(By.xpath(sign_up_page_heading)).getText();
    }
}
