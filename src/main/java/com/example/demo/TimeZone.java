package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZone {
     public static void main(String[]args){
         Scanner keyboard = new Scanner(System.in);
 boolean done= false;
         //get current time
       LocalDateTime rightNow = LocalDateTime.now();
         LocalDate userDate =null;
         DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MMM yyy " );
         DateTimeFormatter longFormat =  DateTimeFormatter.ofPattern("dd MMMM yyyy");
        //Time formatter (time only)
         DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");
         //Output today's date in formats that have been preset
         System.out.println("The current date is: "+rightNow.format(longFormat));
         System.out.println("This is the current date and time unformatted: "+rightNow);
         //Output the current time in formats that have been preset
         System.out.println("This is the current system time: "+ LocalTime.now());
         System.out.println("This is the current system time (24 h format): "+ LocalTime.now().format(hr24));
         //This is how you parse a string with a date time formatter
        // String aDate = "22/09/2018";

 do {
     System.out.println("curent timeis :");
     System.out.println(rightNow.format(longFormat));
     System.out.println(rightNow.format(shortMonthFormat));
     //
     System.out.println("Now Enter a date with format: dd/mm/yyyy");
     String aDate = keyboard.nextLine();
     userDate = LocalDate.parse(aDate, dTF);
     System.out.println(userDate.format(longFormat));
     //Display the date entered
     System.out.println(userDate.format(shortMonthFormat));
     //System.out.println("Now Enter a year");
     //String thisYear = keyboard.nextLine();
     // Year newYear =Year.of(Integer.parseInt(thisYear));
     // System.out.println("This is the year entered:"+newYear);

     //  LocalDate a = LocalDate.of(2014, 6, 30);

     // System.out.println(a.getDayOfWeek().name());

     // System.out.println(rightNow .getDayOfYear());
     //System.out.println(rightNow .getMonth().name());
     // System.out.println(rightNow .getDayOfWeek().name());

     // System.out.println(userDate.getDayOfYear());
     //System.out.println(userDate.getMonth().name());
     //  System.out.println(userDate.getDayOfWeek().name());
     System.out.println(" This day is " + userDate.getDayOfYear() + "  day of year ");
     System.out.println("The month of the year in which this day falls is Month :" + userDate.getMonth().name());
     System.out.println("The day of the week on which this day falls is : " + userDate.getDayOfWeek().name());
 //if (rightNow.compareTo.)
 { System.out.println(" time  enter is past");}

      System.out.println( "do you want to enter new time: (y/n)");
       String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("y") ){
            done= true ;
        }
         else {done= false;}

 }while (done);
     }
}
