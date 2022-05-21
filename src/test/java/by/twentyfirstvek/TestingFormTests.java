package by.twentyfirstvek;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class TestingFormTests extends TestBase {

    @Test
    @DisplayName("Check Header 21Vek.by")
    void checkHeaderMainPage() {
        step("Open 21Vek.by page", () ->
                open(Configuration.baseUrl));
        step("Check Header", () -> {
            $("#header").shouldHave(
                    text("г. Минск"),
                    text("Оплата частями"),
                    text("Бонусная программа"),
                    text("Еще"));
        });
    }
    @Test
    @DisplayName("Check Footer 21Vek.by")
    void checkFooterMainPage() {
        step("Open 21Vek.by page", () ->
                open(Configuration.baseUrl));
        step("Check Footer", () -> {
            $("#footer-inner").shouldHave(
                    text("Покупателям"),
                    text("Доставка"),
                    text("Обработка персональных данных"),
                    text("Оплата"));
        });
    }    @Test
    @DisplayName("Check Search Function 21Vek.by")
    void checkSearchFunction() {
        step("Open 21Vek.by page", () ->
                open(Configuration.baseUrl));
        step("Check Search Function", () -> {
            $("#catalogSearch").setValue("Детские коляски").pressEnter();
            sleep(6000);
            $(".content__header.cr-category_header").shouldHave(text("Результаты поиска"));
            });
    }









}
//    @Test
//    @DisplayName("Registration form")
//    void fillFormTest() {
//        step("Open form on site", () -> {
//            open("/automation-practice-form");
//            executeJavaScript("$('footer').remove()");
//            executeJavaScript("$('#fixedban').remove()");
//        });
//        step("Fill form ", () -> {
//            $("#firstName").setValue("OurFirstName");
//            $("#lastName").setValue("OurLastName");
//            $("#userEmail").setValue("OurEmail@email.com");
//            $("#userNumber").setValue("1234567890");
//            $("#currentAddress").setValue("OurCurrentAddress");
//
//            //Поле с радиобаттоном - выбор пола
//            $("#genterWrapper").$(byText("Male")).click();
//
//            //Дата рождения
//            $("#dateOfBirthInput").click();
//            $(".react-datepicker__year-select").selectOption("2000");
//            $(".react-datepicker__month-select").selectOption("January");
//            $(".react-datepicker__day.react-datepicker__day--019").click();
//
//            //Поле предметов - выпадающее меню
//            $("#subjectsInput").setValue("Hindi").pressEnter();
//
//            //Выбор хобби
//            $("#hobbiesWrapper").$(byText("Reading")).click();
//
//            //Выбор города
//            $("#stateCity-wrapper").click();
//            $(byText("Haryana")).click();
//            $("#city").click();
//            $(byText("Karnal")).click();
//
//            //Зaгрузка файла
//            $("#uploadPicture").uploadFromClasspath("1.png");
//
//            //Кнопка Submit
//            $("#submit").click();
//        });
//        step("Verify form ", () -> {
//            //Проверка введенных данных
//            $(".modal-body").shouldHave
//                    (text("OurFirstName"),
//                            text("OurLastName"),
//                            text("OurEmail@email.com"),
//                            text("1234567890"),
//                            text("Male"),
//                            text("Hindi"),
//                            text("Reading"), text("Haryana"),
//                            text("Karnal"),
//                            text("1.png"),
//                            text("19 January,2000"),
//                            text("OurCurrentAddress"));
//        });
//    }
//}
