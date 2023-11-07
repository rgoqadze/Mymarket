package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    public SelenideElement
            closePopupButton = $(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/button/i")),
            SearchButton = $(byAttribute("type","submit")),
            categoryName = $(byClassName("mr-10px font-medium")),
            Onlinebuy = $(byText("ონლაინ ყიდვა")),
            LocationInpute = $(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div")),
            LocationtValue = $(byText("აბაშა")),
            SearchPageCard = $(".card-col",8),
            LocationOnDetialPage = $(byText("აბაშა")),
            OnlineBuyButton = $(byAttribute("for","radio-os-1-1")),
            FastBuyText = $(byText("სწრაფი ყიდვა")),
            ShopButton = $(byAttribute("for","radio-pt-2-3")),
            CartButton = $(".toggle-cart"),
            PricetoInput = $(byName("PriceTo"));
    public ElementsCollection
            category = $$(byClassName("cats-dot"));

}
