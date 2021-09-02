// import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
    List<String> names = new ArrayList<>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    names.add("大江");
    names.stream().filter(n -> n.length() <= 4).map(n -> n + "さん").forEach(System.out::println);


    // IntPredicate f1 = x -> x % 2 == 1;
    // Func2 f2 = (point, name) -> {
    //   return name + "さんは" + (point > 65 ? "合格" : "不合格");
    // };

    // Func1 f1 = x -> x % 2 == 1;
    // Func2 f2 = (point, name) -> {
    //   return name + "さんは" + (point > 65 ? "合格" : "不合格");
    // };

    // FuncList funclist = new FuncList();
    // Func1 f1 = FuncList::isOdd;
    // Func2 f2 = funclist::passCheck;

    // System.out.println(f1.test(15));
    // System.out.println(f1.call(15));
    // System.out.println(f2.call(66, "Smith"));

    // Function<String, Integer> func = (String s) -> {return s.length(); };
    // int n = func.apply("Java");
    // System.out.println("文字列「Java」は" + n + "文字です");
  }
}

// public class Main{
  // public static Integer len(String s){
  //   return s.length();
  // }
  // public static void main(String[] args){
  //   Function<String, Integer> func = Main::len;
  //   int a = func.apply("Java");
  //   System.out.prinln("文字列「Java」は" + a + "文字です。");
  // }

  // public static int twice(int x){return x * 2;}
  // public static int sub(int a, int b){return a - b;}
// }