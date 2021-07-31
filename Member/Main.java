import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class Main{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    // Map<Integer, String> list = new HashMap<Integer, String>();
  //   Map<Integer, String> list = new HashMap<Integer, String>();

      list.add("ヒカル");
      list.add("むっく");
      list.add("とーま");
      list.add("かすみ");
      // String[][] member = new String[][];
  //   //1～10の整数値を持つリストを用意
    for(int i = 0 ; i < 2  ; i++) {
      for(int j=0; j<2; j++){
        String[][] member = new String[i][j];
        System.out.println(member);
      }
            // list.add(i);
            // System.out.println(list.get(i));
    }
    System.out.println(list);
  //   //リストを表示（確認用）

  //shuffleメソッドで上で作ったリストをシャッフル
    Collections.shuffle(list);

    // //ランダムにした結果を表示
    System.out.println(list);

    
    // Map<String, Integer> prefs = new HashMap<String, Integer>();
    // prefs.put("京都府", 255);
    // prefs.put("東京都", 1261);
    // prefs.put("熊本県", 181);
    // int tokyo = prefs.get("東京都");
    // System.out.println("東京都の人口は、" + tokyo);
    // prefs.remove("京都府");
    // prefs.put("熊本県", 182);
    // int kumamoto = prefs.get("熊本県");
    // System.out.println("熊本県の人口は、" + kumamoto);
  

  }
}