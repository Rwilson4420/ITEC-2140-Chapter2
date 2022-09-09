/**
 * class: Time
 * version 1.0
 * author: Robert Wilson
 * written: September 8, 2022
 * This program will show the time, how much time has passed, and how much time is left
 */
public class Time {
  public static void main(String[]args) {
    int hour = 17;
    int minute = 15;
    int second = 30;
    System.out.println("The time is "+hour+";"+minute+";"second);
      int SEC_PER_MINUTE = 60;
      int SEC_PER_HOUR = 60 * SEC_PER_MINUTE;
      int SEC_PER_DAY = 24 * SEC_PER_HOUR;
     System.out.println(SEC_PER_DAY - secondsElapsedSinceTime + " seconds remain.");
   System.out.println(secondsElapsedSinceTime = 100 / SEC_PER_DAY + "% of the day is over.");
   }
 }  
