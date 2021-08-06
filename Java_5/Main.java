public class Main {
  public static void main (String[] args){
    introduceOneself();
    email("title","address","text");
    email("address","text");
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + triangleArea + "平方cm");
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積：" + circleArea + "平方cm");
  }
  
  public static void introduceOneself(){
    String name = "KT";
    int age = 25;
    float hight = 165;
    char zodiac = '亥';
    System.out.println(name);
    System.out.println(age);
    System.out.println(hight);
    System.out.println(zodiac);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "にメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text){
    System.out.println(address + "にメールを送信しました。");
    System.out.println("件名：" + "無題");
    System.out.println("本文：" + text);
  }
  
  public static double calcTriangleArea(double bottom,double height){
    double area = (bottom * height) /2;
    return area;
  }
  public static double calcCircleArea(double radius){
    double area = radius * radius * 3.14;
    return area;
  }
}