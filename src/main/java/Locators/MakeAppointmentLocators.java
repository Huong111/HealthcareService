package Locators;

import org.openqa.selenium.By;

public class MakeAppointmentLocators {
    public static By INPUT_FACILITY = By.id("combo_facility");

    public static By INPUT_FACILITY(String textFacility) {
        return By.xpath("//div[@class='col-sm-4']//option[text()='" + textFacility + "']");
    }

    public static By CHECK_CHECKBOX_APPLY_FOR_HISTORY = By.id("chk_hospotal_readmission");

    public static By CHOOSE_HEALTHCARE_PROGRAM(int indexHealthcare) {
        return By.xpath("(//div[@class='col-sm-4']//input[@type='radio'])[" + indexHealthcare + "]");
    }

    public static By INPUT_VISIT_DATE = By.id("txt_visit_date");
    public static By INPUT_COMMENT = By.id("txt_comment");
    public static By BUTTON_BOOK_APPOINTMENT = By.id("btn-book-appointment");
}
