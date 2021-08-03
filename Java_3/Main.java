public class Main{
  public static void main (String[] args){
    // System.out.println("数当てゲーム");
    // int ans = new java.util.Random().nextInt(10);
    // for(int i = 0; i < 5; i++ ){
    //   System.out.println("0~9の数字を入力してください");
    //   int num = new java.util.Scanner(System.in).nextInt();
    //   if(ans == num){
    //     System.out.println("あたり！");
    //     break;
    //   }else{
    //     System.out.println("ハズレ");
    //   }
    // }
    // System.out.println("ゲームを終了します。");

    System.out.print("[メニュー]1：検索、2：登録、3：削除、4：変更");
    int select = new java.util.Scanner(System.in).nextInt();
    String s = "正しく入力してください";
    switch (select){
      case 1:
      s = "検索します";
      break;
      case 2:
      s = "登録します";
      break;
      case 3:
      s = "削除します";
      break;
      case 4:
      s = "変更します";
      break;
    }
    System.out.println(s);
  }
}