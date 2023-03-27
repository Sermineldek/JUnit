package applications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

public class TestNotations1 {

    public static void main(String[] args) {
        //Ayarları yapalım
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Nutella", Keys.ENTER);
        driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();

        driver.close();
    }
}
