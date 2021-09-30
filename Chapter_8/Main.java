import java.util.function.*;

public class Main{
  public static void main(String[] args){

    Function<String, Integer> func = (str) -> {
      return Integer.parseInt(str);
    };
    System.out.println(func.apply("100") * 2);

  //   Function f = (name) -> { return "hello, " + name;};
  //   System.out.println(f.test("Lambda"));
  // }
  // private static interface Function{
  //   String test (String name);
  }
}