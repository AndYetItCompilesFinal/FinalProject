public class Mushu extends GoodGuy
{
   public Mushu()
   {
      //items=new 
      //attack=new
      maxhp = 30;
       hp = 30;
      str = 1;
      def = .3;
      spd = 5;
   }

   public String toString()
   {
      return("Mushu");
   }
   
   public int attack1(){
      System.out.println("Mushu breathed fire!");
      return 5;
   }

   public int attack2(){
      System.out.println("Mushu slashed them with his claws!");
      return 5;
   }

   public int attack3(){
      System.out.println("Mushu bit them!");
      return 3;
   }
   
}//end of class