package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.Data;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class PurchasePage {

    private SelenideElement surnameFirstAdult = $("#surname_adult_1").waitUntil(Condition.visible, 30000);
    private SelenideElement nameFirstAdult = $("#name_adult_1");
    private SelenideElement dateOfBirthFirstAdult = $("#birthdate_adult_1");
    private SelenideElement genderFirstAdult = $("#gender_adult_1");
    private SelenideElement genderM = genderFirstAdult.$("button.gender_m");
    private SelenideElement documentFirstAdult = $("#doctype_adult_1");
    private SelenideElement email = $("#passenger_email");
    private SelenideElement phone = $("#phone");

    public void fillFormWithIncorrectLanguageInEn() {
        surnameFirstAdult.setValue(Data.getEnSurname());
        nameFirstAdult.setValue(Data.getEnName());
        documentFirstAdult.click();
        documentFirstAdult.$("div.content").shouldBe(Condition.visible);
        $(withText("Паспорт РФ")).click();
        $(withText("Введите фамилию кириллицей")).shouldBe(Condition.visible);

    }

    public void fillFormWithIncorrectDateOfBirth() {
        dateOfBirthFirstAdult.setValue(Data.invalidDate());
        genderM.click();
        $(withText("Некорректная дата")).shouldBe(Condition.visible);

    }

    public void fillFormWithIncorrectEmail() {
        email.setValue(Data.getInvalidEmail());
        phone.click();
        $(withText("Проверьте правильность ввода")).shouldBe(Condition.visible);

    }
}
