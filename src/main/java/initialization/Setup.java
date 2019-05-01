package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver = null;

    //ToDo : setup the path for the Mozilla-GECKODRIVER (By tomorrow EOD)

    public static WebDriver setupDriver(String platform, String url, String browser) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
    //ToDo : write 5 test case from Facebook

    @Test
    public void findFriends() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void People() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void PageCategories() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void accountSecurity() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void loginHelp() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
