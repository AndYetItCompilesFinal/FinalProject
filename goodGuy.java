public abstract class goodGuy
{
   //Items items;
   //Attack attack;
   int maxhp;
   int hp;
   int str;
   double def;
   int spd;
   
   public goodGuy()
   {
      
   }
   public abstract void display();
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