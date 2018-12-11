/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jfuqua390
 */
public class Appointment {
    public String description;
    public Date date;
    public String startTime;
    public String endTime;
    
    public Appointment(String aDescription, String aDate, String aStartTime, String aEndTime) throws ParseException {
        description = aDescription;
        Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(aDate);
        date=date1;
        startTime=aStartTime;
        endTime=aEndTime;
    }

    
    @Override
    public String toString() {
        return("Description: "+description+
                ", Date: "+date+
                ", Start Time: "+startTime+
                ", End Time: "+endTime+"\n");
    }
}
