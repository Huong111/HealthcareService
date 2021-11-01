package Utils;

import Objects.Appointment;
import Pages.MakeAppointmentPage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Utility {

    /**
     * get Datetime with format dd/mm/yyyy
     *
     * @return
     */
    public String getDatetime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String result = formatter.format(date);
        System.out.println(result);
        return result;
    }

    public static ArrayList<String> readCSV(String string) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(string);
            Scanner scanner = new Scanner(file);
            System.out.println("Read find: ");
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                arrayList.add(str);
            }
            scanner.close();

        } catch (Exception exception) {
            System.out.println("Not find the file");
        }


        return arrayList;
    }

    public static Appointment convertMakeAppointmentString(String string, String delimiter) {
        String[] strings = string.split(delimiter);
        Appointment appointment = new Appointment();
        appointment.setFacility(strings[0]);
        appointment.setHospitalReadmission(strings[1]);
        appointment.setHealthcareProgram(strings[2]);
        appointment.setVisitDate(strings[3]);
        appointment.setComment(strings[4]);

        return appointment;
    }
}
