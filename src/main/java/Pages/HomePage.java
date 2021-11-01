package Pages;

import org.openqa.selenium.WebDriver;

import static Locators.HomeLocators.BUTTON_MAKE_APPOINTMENT;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * click Make Appointment button
     */
    public void clickMakeAppointment() {
        click(BUTTON_MAKE_APPOINTMENT);
    }
}
