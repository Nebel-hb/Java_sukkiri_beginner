// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.util.Date;

// public class Main{
//   public static void main(String[] args){
//     Date now = new Date();
//     Calendar c = Calendar.getInstance();
//     // Calendar c = Calendar.getInstance();
//     c.setTime(now);
//     int day = c.get(Calendar.DAY_OF_MONTH);
//     day += 100;
//     c.set(Calendar.DAY_OF_MONTH, day);
//     Date future = c.getTime();
//     SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//     System.out.println(f.format(future));
//   }
// }


import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main{
  public static void main (String[] args){
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusDays(33);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}