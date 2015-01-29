public class mushu extends goodGuy
{
   public mushu()
   {
      //items=new 
      //attack=new
      maxhp = 30;
      str = 1;
      def = .3;
      spd = 5;
   }

   public void display()
   {
      System.out.println("Mushu");
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