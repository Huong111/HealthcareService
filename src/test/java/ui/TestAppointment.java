package ui;

import Objects.Account;
import Objects.Appointment;
import Pages.*;
import Utils.Constants;
import data.Data;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Utils.Constants.URL_WEB;

public class TestAppointment {
    WebDriver driver;
    Account account;
    Appointment appointment;
    BasePage basePage;
    HomePage homePage;
    LoginPage loginPage;
    MakeAppointmentPage makeAppointmentPage;
    AppointmentConfirmationPage appointmentConfirmationPage;

    @BeforeClass
    public void setUp() {
        basePage = new BasePage(driver);
        driver =  basePage.setupDriver("chrome");
        basePage.navigate(URL_WEB);

        homePage = new HomePage(driver);
        homePage.clickMakeAppointment();

        loginPage = new LoginPage(driver);
        account = Data.getDataAccount();
        loginPage.login(account);

        appointment = new Appointment();
        makeAppointmentPage = new MakeAppointmentPage(driver);
     appointmentConfirmationPage = new AppointmentConfirmationPage(driver);
    }

    @AfterClass
    public void tearDown() {

    }

    @Test
    public void testMakeAppointment() {
      makeAppointmentPage.makeAppointment(appointment);
     //appointmentConfirmationPage.compareAppointment(appointment, appointmentConfirmationPage.getAppointmentInfo());
        appointmentConfirmationPage.compareArraylistAppointment(Data.getMakeAppointment(), appointmentConfirmationPage.getArraylistAppointmentInfo());
    }
}
