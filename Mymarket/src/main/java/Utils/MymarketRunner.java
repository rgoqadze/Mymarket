package Utils;

import StepObject.LoginSteps;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static DataObject.LoginInformation.PasswordValue;
import static DataObject.LoginInformation.UserNameValue;
import static com.codeborne.selenide.Selenide.open;

public class MymarketRunner  {
    @BeforeTest
    public void setupmymarket()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browserSize = "1920x1080";
        open("https://www.mymarket.ge/ka/");
    }
}
