package Pages;

import Objects.Appointment;
import Utils.Utility;
import org.openqa.selenium.WebDriver;

import static Locators.MakeAppointmentLocators.*;

public class MakeAppointmentPage extends BasePage {
    Utility utility;

    public MakeAppointmentPage(WebDriver driver) {
        super(driver);
    }


    /**
     * make Appointment
     *
     * @param appointment
     */
    public void makeAppointment(Appointment appointment) {
        utility = new Utility();
        setTextAppointment(INPUT_FACILITY,"Seoul CURA Healthcare Center");
        click(CHECK_CHECKBOX_APPLY_FOR_HISTORY);
        click(CHOOSE_HEALTHCARE_PROGRAM(2));
        setTextAppointment(INPUT_VISIT_DATE,utility.getDatetime());
        setTextAppointment(INPUT_COMMENT,"aaa");
        click(BUTTON_BOOK_APPOINTMENT);
    }
}
