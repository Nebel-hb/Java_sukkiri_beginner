import java.util.function.*;
public class Main{
  public static Integer len(String s){
    return s.length();
  }
  public static void main(String[] args){
    Function<String, Integer> func = Main::len;
    int a = func.apply("Java");
    System.out.prinln("文字列「Java」は" + a + "文字です。");
  }

  // public static int twice(int x){return x * 2;}
  // public static int sub(int a, int b){return a - b;}
}