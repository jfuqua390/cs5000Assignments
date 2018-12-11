/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jfuqua390
 */
public class MyCalendar {
    public static void main() {
        AppointmentCalendar myCalendar = new AppointmentCalendar(); 
        System.out.println("Beginning..");
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("A=Add Appointment, B=Remove Appointment, C=View Appointments");
            String command = in.next();
            in.nextLine();
            if(command.equalsIgnoreCase("A")) {
                System.out.println("Please Enter the Description for Appointment");
                String desc = in.nextLine();
                System.out.println("Enter the Date (YYYY/MM/DD):");
                String date = in.nextLine();
                System.out.println("Enter the Start Time: (HH:MM)");
                String sTime = in.next();
                System.out.println("Enter the End Time: (HH:MM)");
                String eTime = in.next();
                try {
                    myCalendar.addAppointment(new Appointment(desc,date,sTime,eTime));
                    System.out.println("Appointment Added.");
                } catch (ParseException ex) {
                    System.out.println("Unable to create appointment");
                }
            }
            else if(command.equalsIgnoreCase("B")) {
                ArrayList<Appointment> appos = myCalendar.getAllAppointments();
                int index = 0;
                for(Appointment appo : appos) {
                    System.out.print(index++);
                    System.out.print(" -- ");
                    System.out.println(appo.toString());
                }
                System.out.println("Enter the appointment number to remove:");
                int rInt = in.nextInt();
                Appointment appoToDelete = appos.get(rInt);
                myCalendar.removeAppointment(appoToDelete);
                System.out.println("Appointment Removed");
            }
            else if(command.equalsIgnoreCase("C")) {
                System.out.println("Enter the day which you would like to view: (YYYY/MM/DD)");
                String day = in.next();
                try {
                    ArrayList<Appointment> appos = myCalendar.getAppointmentsByDay(day);
                    for(Appointment appo : appos) {
                        System.out.println(appo.toString());
                    }
                } catch (ParseException ex) {
                    System.out.println("Improper Format");
                }
            } else {
                System.out.println("Unable to read input, exiting....");
                return;
            }
        }
        
    }
}
