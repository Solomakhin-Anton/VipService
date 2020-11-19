package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TicketsPage {

    private SelenideElement selectionOfFlights = $("#app_wl_avia_breadcrumbs > div.active").waitUntil(Condition.visible, 30000);

    public PurchasePage makeAChoice() {
        selectionOfFlights.shouldBe(Condition.visible);
        $$("[class='biletix-button biletix-button_theme-green']").first().click();
        return new PurchasePage();
    }
}
