public class Cleric {
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
    System.out.println("MPは" + this.mp + "になった");
  }
  public void pray(int sec){
    System.out.println(this.name + "は祈りを唱えた");
    int recover = sec;
    // int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MAX_MP-this.mp, recover);
    this.mp += recoverActual;
    // if (this.mp > this.MAX_MP){
    //   p = p - (this.mp - this.MAX_MP);
    //   this.mp = this.MAX_MP;
    // }
    System.out.println("MPは、" + recoverActual + "ポイント回復、" + this.mp + "になった。");
    // return recoverActual;
  }
}