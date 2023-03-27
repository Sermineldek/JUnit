package applications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

public class TestNotations2 {

    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https:www.amazon.com");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Nutella", Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();

        driver.close();
    }
}
