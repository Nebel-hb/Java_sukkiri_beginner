public class Main{
  public static void main(String[] args){
    System.out.println("計算を開始します。");

    System.out.println("計算完了。結果をメモ帳で表示します。");
    ProcessBuilder pd = new ProcessBuilder(
      "c:¥¥windows¥¥System32¥¥notepad.exe",
      "calcreport.txt"
    );
    pd.start();

    // boolean isErr = true;
    // if (isErr){
    //   System.out.println("データが壊れています。異常終了します。");
    //   System.exit(1);
    // }
    // System.out.println("正常終了しました。");
  }
}