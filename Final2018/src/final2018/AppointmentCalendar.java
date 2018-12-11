/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jfuqua390
 */
public class AppointmentCalendar {
    public ArrayList<Appointment> appointments;
    public int state;
    
    public AppointmentCalendar() {
        appointments = new ArrayList<>();
    }
    
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    
    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
    
    public Appointment getAppointmentByDesc(String desc) {
        for(Appointment appo : appointments) {
            if(appo.description.equalsIgnoreCase(desc)) {
                return appo;
            }
        }
        return null;
    }
    
     public ArrayList<Appointment> getAllAppointments()  {
         return appointments;
     }
    
    public ArrayList<Appointment> getAppointmentsByDay(String day) throws ParseException {
        Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(day);
        ArrayList<Appointment> appoByDay = new ArrayList<>();
        for (Appointment appo : appointments) {
            if(appo.date.equals(date1)) {
                appoByDay.add(appo);
            }
        }
        return appoByDay;
    }
    
    public void removeAllAppointments() {
        appointments.removeAll(appointments);
    }
    
    public int getState() {
        return state;
    }
}
