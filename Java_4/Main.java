public class Main {
  public static void main(String[] args){
    // int[] points = new int[4];
    // double[] weights = new double[5];
    // boolean[] answers = new boolean[3];
    // String[] names = new String[3];

    // int[] moneyList = {121902, 8302, 55100};
    // for(int i = 0; i< moneyList.length; i++){
    //   System.out.println(moneyList[i]);
    // }
    // for(int a : moneyList){
    //   System.out.print(a);
    // }

    int[] numbers = {3,4,9};
    System.out.println("１桁の数字をキーボードに入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int i : numbers){
      if (i == input){
        System.out.println("あたり！");
      }
    }
  }
}