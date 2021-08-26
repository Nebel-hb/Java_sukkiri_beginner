import java.util.*;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();
    names.add("Minato");
    names.add("Asaka");
    names.add("Sugawara");
    Iterator<String> it = names.iterator();
    while (it.hasNext()){
      String e = it.next();
      System.out.println(e);
    }

    // ArrayList<Integer> points = new ArrayList<>();
    // points.add(10);
    // points.add(80);
    // points.add(75);
    // for (int i = 0; i < points.size(); i++){
    //   System.out.println(points.get(i));
    // }

    // Hero h1 = new Hero("斉藤");
    // Hero h2 = new Hero("鈴木");
    // // List<Hero> heroes = new ArrayList<Hero>();
    // // heroes.add(h1);
    // // heroes.add(h2);
    // // for (Hero h : heroes){
    // //   System.out.println(h.getName());
    // // }

    // Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    // heroes.put(h1, 3);
    // heroes.put(h2, 7);
    // for (Hero key : heroes.keySet()){
    //   int value = heroes.get(key);
    //   System.out.println(key.getName() + "が倒した敵＝" + value);
    // }
  }
}