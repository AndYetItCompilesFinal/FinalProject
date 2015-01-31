public abstract class GoodGuy
{
   //Items items;
   //Attack attack;
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
   public void chooseAttack()
   {
      //attack.attack();
   }
   
   public abstract int attack1();
   
   public abstract int attack2();
   
   public abstract int attack3();

}//end of class