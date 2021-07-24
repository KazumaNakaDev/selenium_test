import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        Thread.sleep(1000);

        WebElement searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys("Hello World");

        Thread.sleep(1000);

        searchElement.submit();

        Thread.sleep(3000);

        driver.close();
    }

}
