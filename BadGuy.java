public abstract class BadGuy
{
   //Items items;
   //Attack attack;
   int maxhp;
   int hp;
   int str;
   double def;
   int spd;
   
   public BadGuy()
   {
   
   }
   public abstract String toString();
   public void chooseItem()
   {
      //items.item();
   }
   public void chooseAttack()
   {
      //attack.attack();
   }
   
   public abstract int attack1();
   
   public abstract int attack2();
   
   public abstract int attack3();
   
      
   public int getMaxHp(){
      return this.maxhp;
   }
   
   public void setMaxHp(int val){
      this.maxhp = val;
   }
   
   public int getHp(){
      return this.hp;
   }
   
   public void setHp(int val){
      this.hp = val;
   }
   
   public int getStr(){
      return this.str;
   }
   
   public void setStr(int val){
      this.str = val;
   }
   
   public double getDef(){
      return this.def;
   }
   
   public void setDef(double val){ 
      this.def = val;
   }
   
   public int getSpd(){
      return this.spd;
   }
   
   public void setSpd(int val){
      this.spd = val;
   }
    


}