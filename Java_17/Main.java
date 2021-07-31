// public class Main{
//   public static void main(String[] args){
//     // String s = null;
//     // System.out.println(s.length());

//     // try{
//     //   String s = null;
//     //   System.out.println(s.length());
//     // }catch (NullPointerException e){
//     //   System.out.println("NullPointerExceptionをcatch");
//     //   System.out.println("ここから");
//     //   e.printStackTrace();
//     //   System.out.println("ここまで");
//     // }

//     try{
//       int i = Integer.parseInt("三");
//     }catch(NumberFormatException e){
//       System.out.println("catch");
//     }
//   }
// }

import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException{
    System.out.println("open program");
    throw new IOException();
  }
}
