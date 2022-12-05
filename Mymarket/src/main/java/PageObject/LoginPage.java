package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
        closePopupButton = $(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/button/i")),
        authorizationButton = $(byText("ავტორიზაცია")),
        textEnter = $(byText("შესვლა")),
        emailInput = $(byId("Email")),
        passwordInput = $(byId("Password")),
        loginButton = $(byXpath("//button['btn btn-lg']"));
}
