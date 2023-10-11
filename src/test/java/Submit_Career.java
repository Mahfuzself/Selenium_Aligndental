import org.dataloader.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Submit_Career{
        public static void main(String[] args) {
                WebDriver driver;
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver","E:\\RL QA\\chromedriver-win64\\chromedriver.exe");
                driver.get("https://alignmedical.com/");
                driver.findElement(By.xpath("//a[contains(text(),'HOME')]")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//a[contains(text(),'LOCATIONS')]")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//a[contains(text(),'CAREER')]")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("(//a[text()=\"Contact Us \"])[1]")).click();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.quit();
        }


}
