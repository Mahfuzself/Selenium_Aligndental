import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {
   static WebDriver driver;
        public WebDriver NavigateBrowser(String browserName,String url)
        {
           if(browserName.equals("firefox")){
               driver = new FirefoxDriver();
           } else if (browserName.equals("IE")) {
               driver = new InternetExplorerDriver();
           }
           else if(browserName.equals("chrome")){
             driver = new ChromeDriver();
           }
           driver.manage().window().maximize();
           driver.get("url");
            return driver;
        }


}
