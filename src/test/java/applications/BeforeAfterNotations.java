package applications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterNotations {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() {driver.close(); }

    @Test
    public void test01(){
        driver.get("Https:www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https:www.bestbuy.com");
    }

    @Test
    public void test03() {
        driver.get("https:www.faebook.com");
    }
}
