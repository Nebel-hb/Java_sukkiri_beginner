import java.util.*;
class Hero {
  private String name;
  public Hero(String name){this.name = name;}
  public String getName(){return this.name;}
}

// public class Main {
//   public static void main(String[] args) {  
//     Hero h1 = new Hero("鈴木");
//     Hero h2 = new Hero("佐藤");
//     Map<Hero, Integer> heros = new HashMap<>();
//     heros.put(h1, 7);
//     heros.put(h2, 3);
//     for (Hero h : heros.keySet()){
//       int value = heros.get(h);
//       System.out.println(h.getName() + value);
//     }
    

    // Map<String, Integer> prefs = new LinkedHashMap<>();
    // prefs.put("b", 2);
    // prefs.put("a", 1);
    // prefs.put("c", 3);
    // for (String key : prefs.keySet()){
    //   int value = prefs.get(key);
    //   System.out.println(key + value);
    // }
    

    // Set<String> words = new TreeSet<String>();
    // words.add("dog");
    // words.add("cat");
    // words.add("panda");
    // for(String s : words){
    //   System.out.println(s);
    // }

    // ArrayList<String> names = new ArrayList<>();
    // names.add("Minato");
    // names.add("Asaka");
    // names.add("Sugawara");
    // Iterator<String> it = names.iterator();
    // while (it.hasNext()){
    //   String e = it.next();
    //   System.out.println(e);
    // }

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

    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);
    for (Hero key : heroes.keySet()){
      int value = heroes.get(key);
      System.out.println(key.getName() + "が倒した敵＝" + value);
    }
  }
}