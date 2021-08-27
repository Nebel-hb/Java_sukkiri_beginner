public class Hero implements Cloneable{
  String name;
  int hp;
  Sword sword;

  public Hero clone(){
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword.clone();
    return result;
  }


  public boolean equals(Object o){
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Hero)) return false;
    Hero r = (Hero)o;
    // if (!this.name.trim().equals(r.name.trim())){
    //   return false;
    // }
    return true;
  }
}