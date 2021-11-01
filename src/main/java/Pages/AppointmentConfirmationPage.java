package Pages;

import Objects.Appointment;
import org.apache.http.util.Asserts;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

import static Locators.AppointmentConfirmationLocators.GET_FACILITY;

public class AppointmentConfirmationPage extends BasePage {

    public AppointmentConfirmationPage(WebDriver driver) {
        super(driver);
    }

    /**
     * get Appointment Info
     *
     * @return
     */
    public Appointment getAppointmentInfo() {
        Appointment appointment = new Appointment();
        appointment.getFacility();
        appointment.getHospitalReadmission();
        appointment.getHealthcareProgram();
        appointment.getVisitDate();
        appointment.getComment();

        return appointment;
    }

    public ArrayList<Appointment> getArraylistAppointmentInfo() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        for (int i = 1; i <= makeSizeAppointmentInfo(); i++) {
            appointments.add(getAppointmentInfo());
        }
        return appointments;
    }

    public int makeSizeAppointmentInfo() {
        return getElementsSize(GET_FACILITY);
    }


    public void compareAppointment(Appointment expected, Appointment actual) {
        Assert.assertEquals(expected.getFacility(), actual.getFacility());
        Assert.assertEquals(expected.getHealthcareProgram(), actual.getHealthcareProgram());
        Assert.assertEquals(expected.getHospitalReadmission(), actual.getHospitalReadmission());
        Assert.assertEquals(expected.getVisitDate(), actual.getVisitDate());
        Assert.assertEquals(expected.getComment(), actual.getComment());

    }

    public void compareArraylistAppointment(ArrayList<Appointment> expected, ArrayList<Appointment> actual) {
        Assert.assertEquals(expected.size(), actual.size());
        for (int i = 1; i < expected.size(); i++) {
            compareAppointment(expected.get(i), actual.get(i));
        }

    }
}
