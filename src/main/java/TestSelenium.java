import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

    public static void main(String[] args) {

        initialize();


    }

    private static void initialize() {

        System.setProperty("webdriver.gecko.driver", "/Users/admin/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));

        element.sendKeys("abc@gmail.com");

        WebElement button= driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }

}
