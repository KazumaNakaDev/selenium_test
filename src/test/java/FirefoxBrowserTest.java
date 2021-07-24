import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.google.common.truth.Truth.assertThat;

public class FirefoxBrowserTest {

    @Test
    public void testMain(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}