package data;

import Objects.Account;
import Objects.Appointment;
import Pages.MakeAppointmentPage;
import Utils.Utility;

import java.util.ArrayList;

import static Utils.Constants.LINK_APPOINTMENTCONFORMATION_CSV;
import static Utils.Utility.convertMakeAppointmentString;

public class Data {

    public static Account getDataAccount() {
        Account account = new Account();
        account.setUsername("John Doe");
        account.setPassword("ThisIsNotAPassword");

        return account;
    }

    public static ArrayList<Appointment> getMakeAppointment() {
        ArrayList<String> arrayListcsv = Utility.readCSV(LINK_APPOINTMENTCONFORMATION_CSV);
        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Seoul CURA Healthcare Center;Yes;Medicaid;26/10/2021;aaa");
        ArrayList<Appointment> appointments = new ArrayList<>();

        for (int i = 0; i < arrayListcsv.size(); i++) {
            appointments.add(convertMakeAppointmentString(arrayListcsv.get(i).toString(), ";"));
        }

        return appointments;
    }
}
