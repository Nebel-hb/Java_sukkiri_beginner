// public class Main{
//   public static void main (String[] args){
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < 100; i++){
//       sb.append(i+1).append(",");
//     }
//     String s = sb.toString();
//     String[] a = s.split(",");
//     for (int j = 0; j < 100; j++){
//       System.out.print(a[j]);
//     }
//   }
// }

// public String concatPath(String folder,String file){
//   if(!folder.endWith("¥¥")){
//     folder += "¥¥";
//   }
//   return folder + file;
// }

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
//     day += 18;
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
    LocalDate future = now.plusDays(18);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}