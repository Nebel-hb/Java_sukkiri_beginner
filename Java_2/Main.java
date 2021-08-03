public class Main{
  public static void main (String[] args){
    System.out.println("ようこそ占いの館へ");
    System.out.println("名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("年齢を入力してください");
    int ages = new java.util.Scanner(System.in).nextInt();
    int future = new java.util.Random().nextInt(4);
    future++;
    System.out.println("占いの結果が出ました。");
    System.out.println(ages + "歳" + name + "さんの運気番号は" + future);
    System.out.println("1234");
  }
}