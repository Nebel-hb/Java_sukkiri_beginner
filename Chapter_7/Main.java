public class Main{
  public static void main(String[] args){
    A a = new A();
    A b = new B();
    System.out.print(a.val);
    System.out.print(b.val);
    a.print();
    b.print();

    // AbstractSample s = new ConcreteSample();
    // s.sample();

    // A a = new B();
    // a.sample();
  }
}