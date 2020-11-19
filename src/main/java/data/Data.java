package data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {

    public static String getEnName(){
        Faker faker = new Faker(new Locale("en"));
        return faker.name().firstName();
    }

    public static String getEnSurname() {
        Faker faker = new Faker(new Locale("en"));
        return faker.name().lastName();
    }

    public static String invalidDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate newDate = today.minusYears(140);
        return formatter.format(newDate);
    }

    public static String getInvalidEmail() {
        return "123@456.78";
    }

}
