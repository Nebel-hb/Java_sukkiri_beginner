public class Main{
  public static void main (String[] args){
    Hero h = new Hero();
    SuperHero sh = new SuperHero();
    Matango m = new PoisonMatango('A');
    m.attack(h);
    PoisonMatango pm = new PoisonMatango('S');
    // pm.attack(sh);
    h.run();
    sh.run();
  }
}