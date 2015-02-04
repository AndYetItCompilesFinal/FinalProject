public class Gaston extends BadGuy
{
   public Gaston()
   {
      //items=new
      //attacks=new
      maxhp = 80;
      str = 4;
      def = .05;
      spd = 3;
   }
   
   public String toString()
   {
      return("Gaston");
   }
   
   public int attack1(){
      System.out.println("Gaston fired an arrow at the party!");
      return 10;
   }

   public int attack2(){
      System.out.println("Gaston punched you!");
      return 5;
   }

   public int attack3(){
      System.out.println("Gaston kicked you!");
      return 7;
   }
   
   public boolean attackItem()
   {
      System.out.println("Gaston is now using his bow and arrows as his weapon of choice.");
      return true;  
   }

}//end class