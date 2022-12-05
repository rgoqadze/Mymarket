package Mymarket;

import StepObject.SearchSteps;
import Utils.MymarketRunner;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchPageTests extends MymarketRunner {

        @Test(priority = 0)
        @Severity(SeverityLevel.NORMAL)
        @Description("Location Filter Check")
        public void SearchLocation() {
            SearchSteps steps = new SearchSteps();
            steps
                    .ClosePopup()
            .GoToSearchPage()
            .CategoryCheck()
            .Scroll()
            .ClickLocation()
            .ChooseLocation()
            .ClickCard();
        }

     /*   @Test(retryAnalyzer = Retry.class, priority = 1)
        @Severity(SeverityLevel.CRITICAL)
        @Description("OnlineShop and Shop Filter")
        public void SearchOnlineShop() {
            SearchSteps steps = new SearchSteps();
            steps.GoToSearchPage();
            steps.Scroll();
            steps.ClickOnlineBuy();
            sleep(3000);
            steps.ClickCard();
            sleep(3000);
            Assert.assertTrue(steps.FastBuyText.isDisplayed());
            back();
            steps.Scroll();
            steps.ClickShopButton();
            steps.CartButton.shouldBe(Condition.visible, Duration.ofMillis(5000));
            Assert.assertTrue(steps.CartButton.isDisplayed());
        }*/

   /* @Test(retryAnalyzer = Retry.class, priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Price Filter Check")
    public void MaxPriceCheck() {
        SearchSteps steps = new SearchSteps();
        steps.Scroll();
        steps.FillMaxPriceInput(MaxPriceValue);
        sleep(5000);
        int PriceValue = $$(".text-dark").size();
        for (int i = 0; i < PriceValue; i++) {
            $$(".text-dark").get(i).getText();
            Assert.assertNotEquals(MaxPriceValue, PriceValue);
        }
    }*/
    }

