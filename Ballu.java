public class Ballu extends GoodGuy
{
   public Ballu()
   {
      //items=new
      maxhp = 50;
       hp = 50;
      str = 4;
      def = .1;
      spd = 3;
   }
   
   public String toString()
   {
      return("Ballu");
   }

   public int attack1(){
      System.out.println("Ballu slashed them with his claws!");
      return 5;
   }

   public int attack2(){
      System.out.println("Ballu smacked them with a coconut!");
      return 5;
   }

   public int attack3(){
      System.out.println("Ballu grappled them in a bear hug!");
      return 10;
   }  

}//end of class