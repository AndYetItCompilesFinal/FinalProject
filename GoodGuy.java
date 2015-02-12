import java.util.Scanner;

public abstract class GoodGuy
{
   //Items items;
   int maxhp;
   int hp;
   int str;
   double def;
   int spd;
   
   public GoodGuy()
   {
      
   }
   public abstract String toString();
   public void chooseItem()
   {
      //items.item();
   }
   public int chooseAttack()
   {
       System.out.println("Choose your Attack!");
       System.out.println("1.Attack 1.");
       System.out.println("2.Attack 2.");
       System.out.println("3.Attack 3.");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number now: ");
       int attackChosen = sc.nextInt();
       int baseAttack;
       if(attackChosen == 1){
          baseAttack = attack1();
       }else if(attackChosen == 2){
          baseAttack = attack2();
       }else{
          baseAttack = attack3();
       }
       return baseAttack;
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
    

}//end of class