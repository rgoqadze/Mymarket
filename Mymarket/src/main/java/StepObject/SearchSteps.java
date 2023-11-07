package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchSteps extends SearchPage {
    @Step("Close fishing popup")
    public  SearchSteps ClosePopup() {
        closePopupButton.click();
        return this;
    }


    @Step("Go to search page")
    public SearchSteps GoToSearchPage() {
        SearchButton.click();
        return this;
    }

    public SearchSteps CategoryCheck() {
        for(int i=0; i<=category.size(); i++){
            category.get(i).shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
            System.out.println(categoryName.getText()+"+++++++++++++++");
            back();
            sleep(3000);
        }

        return this;
    }

    @Step("scroll in to online buy")
    public SearchSteps Scroll() {
        Onlinebuy.scrollIntoView(true);
        return this;
    }

    @Step("Click location input")
    public SearchSteps ClickLocation() {
        LocationInpute.click();
        return this;
    }

    @Step("Choose location")
    public SearchSteps ChooseLocation() {
        LocationtValue.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();

        return this;
    }

    @Step("Click product card")
    public SearchSteps ClickCard() {
        SearchPageCard.click();
        Assert.assertTrue(LocationOnDetialPage.isDisplayed());
        return this;
    }

    @Step("Clic online buy radiobutton")
    public SearchSteps ClickOnlineBuy() {
        OnlineBuyButton.shouldBe(Condition.visible,Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Click shop filter radio button")
    public SearchSteps ClickShopButton() {
        ShopButton.shouldBe(Condition.visible,Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Fill max price value input")
    public SearchSteps FillMaxPriceInput(int MaxPriceValue) {
        PricetoInput.setValue(String.valueOf(String.valueOf(MaxPriceValue)));
        return this;
    }
}
