public class Hades extends BadGuy
{
   public Hades()
   {
      //items=new
      //attacks=new
      maxhp = 100;
      str = 4;
      def = .2;
      spd = 4;
   }
   public String toString(){
      return("Hades");
   }
   
   public int attack1(){
      System.out.println("Hades threw a fireball!");
      return 15;
   }

   public int attack2(){
      System.out.println("Hades had his minions attack you!");
      return 10;
   }

   public int attack3(){
      System.out.println("Hades sapped your power!");
      return 0;
   }
   
   public boolean attackItem()
   {
      System.out.println("Hades is now using his attack powers.");
      return true;  
   }



}//end of class