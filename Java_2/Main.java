public class Main{
  public static void main (String[] args){
    System.out.println("ようこそ");
    System.out.println("名前を入力");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("年齢を入力");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    // fortune++;
    System.out.println("占い結果");
    System.out.println(age + "才の" + name + "さんの運気番号は" + fortune + "です。");
    System.out.println("1:大吉　2:中吉　3:吉　4:凶");
  }
}