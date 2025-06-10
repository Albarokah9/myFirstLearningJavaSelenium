import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximalkan jendela browser

        // Navigate ke Google
        driver.get("https://www.google.com");

        // Navigate ke Udemy
        driver.navigate().to("https://www.udemy.com");
        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyUrl); // Output Udemy pertama, dengan baris baru

        // Kembali ke halaman sebelumnya (Google)
        driver.navigate().back();
        //driver.getCurrentUrl(); // Baris ini tidak perlu karena Anda langsung mengambilnya lagi di bawah
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleUrl); // Output Google pertama, dengan baris baru

        // Maximalkan jendela (sudah dilakukan di awal, mungkin tidak perlu di sini lagi kecuali ada resize)
        driver.manage().window().fullscreen();
        //Thread.sleep(200); // Thread.sleep tidak disarankan dalam Selenium, gunakan WebDriverWait jika perlu

        // Refresh halaman
        driver.navigate().refresh();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleUrl); // Output Google kedua, dengan baris baru

        // Maju ke halaman berikutnya (Udemy)
        driver.navigate().forward();
        udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is: " + udemyUrl); // Output Udemy kedua, dengan baris baru

        //Thread.sleep(1000); // Thread.sleep tidak disarankan
        driver.quit(); // Menutup browser dan sesi driver
    }
}