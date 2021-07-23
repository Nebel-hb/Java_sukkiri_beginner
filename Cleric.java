public class Creric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  
  public void selfAid(){
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した。");
  }
  public void pray(int sec){
    System.out.println(this.name + "は祈りを唱えた");
    int r = new java.util.Random().nexInt(3);
    int p = sec + r;
    this.mp += p;
    if (this.mp > this.MAX_MP){
      p = p - (this.mp - this.MAX_MP);
      this.mp = this.MAX_MP;
    }
    System.out.println("MPは、" + p + "ポイント回復した。");
  }
}