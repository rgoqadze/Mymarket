package Utils;

import StepObject.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.LoginInformation.PasswordValue;
import static DataObject.LoginInformation.UserNameValue;

@Listeners(TestLister.class)
public class Autorization {
    @Test(retryAnalyzer = Retry.class)
    @BeforeClass
    public void login() {
        LoginSteps steps = new LoginSteps();
        steps.ClosePopup();
        steps.GoToLoginPage();
        Assert.assertTrue(steps.textEnter.isDisplayed());
        steps.FillUsername(UserNameValue);
        steps.FillPassword(PasswordValue);
        steps.ClickEnter();


    }

}
