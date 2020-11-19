package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement departure = $("#departure");
    private SelenideElement arrival = $("#arrival");
    private SelenideElement dateDeparture = $("#date-departure-input");
    private SelenideElement dateArrival = $("#date-arrival");
    private SelenideElement qanPassengers = $("[class='passengers-select']");
    private SelenideElement searchButton = $("[class='btn-search triangle']");

    public TicketsPage validInput() {
        departure.click();
        $("[class='autocomplete']").$(withText("Санкт-Петербург, Россия")).click();
        arrival.setValue("Москва");
        dateDeparture.click();
        $("[class='react-datepicker-popper']").$("[class='react-datepicker__navigation react-datepicker__navigation--next']").click();
        $("[class='react-datepicker-popper']").$("[aria-label='day-15']").click();
        $("[class='react-datepicker-popper']").$("[class='backticket']").click();
        dateArrival.click();
        $("[class='react-datepicker-popper']").$("[class='react-datepicker__navigation react-datepicker__navigation--next']").click();
        $("[class='react-datepicker-popper']").$("[aria-label='day-15']").click();
        $("[type='adult']").$("[class='plus']").doubleClick();
        $("[type='child']").$("[class='plus']").doubleClick();
        $("[type='child']").$("div > div.minus").click();
        $("[type='infant']").$("[class='plus']").click();
        $("[class='checkbox black']").click();
        searchButton.click();
        return new TicketsPage();
    }
}
