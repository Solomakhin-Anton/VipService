import lombok.val;
import org.testng.annotations.*;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class AppTest {

    @Test
    void shouldFillFormWithIncorrectLanguageInEn(){
        open("https://biletix.ru/new");
        val mainPage = new MainPage();
        val ticketsPage = mainPage.validInput();
        val purchasePage = ticketsPage.makeAChoice();
        purchasePage.fillFormWithIncorrectLanguageInEn();
    }

    @Test
    void shouldFillFormWithIncorrectDateOfBirth(){
        open("https://biletix.ru/new");
        val mainPage = new MainPage();
        val ticketsPage = mainPage.validInput();
        val purchasePage = ticketsPage.makeAChoice();
        purchasePage.fillFormWithIncorrectDateOfBirth();
    }

    @Test
    void shouldFillFormWithIncorrectEmail() {
        open("https://biletix.ru/new");
        val mainPage = new MainPage();
        val ticketsPage = mainPage.validInput();
        val purchasePage = ticketsPage.makeAChoice();
        purchasePage.fillFormWithIncorrectEmail();
    }
}
