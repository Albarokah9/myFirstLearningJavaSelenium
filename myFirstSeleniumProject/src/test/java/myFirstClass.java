import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.udemy.com");
        driver.navigate().back();
        driver.getCurrentUrl();

        driver.manage().window().fullscreen();
        Thread.sleep(200);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.quit();
    }
}