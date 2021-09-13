public class Main{
  public static void main(String[] args){
    Sample s = new Sample(10);
    modify(s.num);
    System.out.println(s.num);
  }
  private static void modify(int num){
    num *= 2;
  }
    // Sample.num = 10;
    // Sample s = new Sample();
    // Sample s2 = new Sample();
    // s.num += 10;
    // s2.num = 30;
    // System.out.println(Sample.num);

    // Item a = new Item();
    // Item b = new Item();
    // b.setNum(20);
    // System.out.println(a.getNum());
  // }
}