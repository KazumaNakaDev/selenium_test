import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class FirefoxBrowserTest {

    private FirefoxDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void OpenGoogleOnFirefox(){
        driver.get("https://www.google.com/");
    }

    @After
    public void tearDown() {
        driver.close();
    }

}