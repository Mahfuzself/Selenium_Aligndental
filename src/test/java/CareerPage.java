import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CareerPage {
   WebDriver driver;
   public CareerPage(WebDriver Idriver){
      this.driver = Idriver;
   }
   @FindBy(xpath = "//a[contains(text(),'CAREER')]")
    WebElement CareerPage;
   @FindBy(xpath = "//input[@name=\"name\"]")
    WebElement inputCareerName;
    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement inputCareerEmail;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement clickSubmittBtn;


}
