package com.stackroute.Pe3;
import java.util.*;
import java.time.*;
import java.text.*;
public class DateofWeek {

        public static void main(String []args){
            // Get calendar set to current date and time
            Calendar calenderobj = Calendar.getInstance();

            // Set the calendar to monday of the current week
            calenderobj.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            System.out.println();
            // Print dates of the current week starting on Monday
            DateFormat dateFormatobj = new SimpleDateFormat("EEE dd/MM/yyyy");
            System.out.println("First Date of Week:");
            System.out.println(dateFormatobj.format(calenderobj.getTime()));
            for (int i = 0; i <6; i++) {
                calenderobj.add(Calendar.DATE, 1);
            }
            // Print dates of the Last date
            System.out.println("Last Date of Week:");
            System.out.println(dateFormatobj.format(calenderobj.getTime()));
            System.out.println();
        }
    }

