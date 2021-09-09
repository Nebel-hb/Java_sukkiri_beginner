public class Main{
  public static void main(String[] args){
    // Sample s = new Sample("sample");
    // s.test();
    String a = "abcde";
    StringBuilder sb = new StringBuilder();
    sb.append("abcde");
    a.replace("a", "k");
    sb.reverse();
    sb.replace(0,1, "k");
    // System.out.println(a.replace("a", "k"));
    System.out.println(a);
    System.out.println(sb);
  }
}