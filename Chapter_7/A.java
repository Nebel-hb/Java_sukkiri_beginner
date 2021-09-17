class A{
  String val = "A";
  void print(){
    System.out.print(val);
  }

// public interface A{
  // default void sample(){
  //   System.out.println("sample");
  // }
}

class B extends A{
  String val = "B";
}