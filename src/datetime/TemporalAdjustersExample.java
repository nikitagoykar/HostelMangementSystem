package datetime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

 //TemporalAdjuster exampleThe TemporalAdjuster is based on the low level Temporal interface.
//This method allows an adjustment from LocalDate to LocalDate to be wrapped to match the

public class TemporalAdjustersExample {

 public static void main(String[] args) {

  LocalDate localDate = LocalDate.now();

  System.out.println("Current Date : " + localDate);

  // get first day of the month
  LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
  System.out.println("firstDayOfMonth : " + firstDayOfMonth);

  // get first day of next month
  LocalDate firstDayOfNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
  System.out.println("firstDayOfNextMonth : " + firstDayOfNextMonth);

  // first day of the year
  LocalDate firstDayOfYear = localDate.with(TemporalAdjusters.firstDayOfYear());
  System.out.println("firstDayOfYear : " + firstDayOfYear);

 }

}