public class PeterPan extends GoodGuy
{
   public PeterPan()
   {
      //items=new
      //attack=new
      maxhp = 40;
      str = 3;
      def = .25;
      spd = 4;
   }
   public String toString()
   {
      return("Peter Pan");
   }
   
   public int attack1(){
      System.out.println("Peter Pan slashed at them with his sword!");
      return 10;
   }

   public int attack2(){
      System.out.println("Tinker Bell used her pixie dust to put the enemy to sleep.");
      return 2;
   }

   public int attack3(){
      System.out.println("Peter Pan's shadow attacked!");
      return 6;
   }
   



}