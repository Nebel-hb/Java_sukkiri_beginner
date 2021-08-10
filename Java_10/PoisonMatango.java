public class PoisonMatango extends Matango{
  int poisonCount = 5;
  public PoisonMatango(char suffix){
    super(suffix);
  }
  public void attack(Hero h){
    super.attack(h);
    if (poisonCount > 0){
      System.out.println("胞子をばらまく");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ");
      poisonCount--;
    }
  }
}