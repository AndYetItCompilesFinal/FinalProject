public class Gaston extends BadGuy
{
   public Gaston(Room room)
   {
      this();
      this.room=room;
   }
   public Gaston()
   {
      maxhp = 80;
      hp = 80;
      str = 4;
      def = .05;
      spd = 3;
   }
   public int getSize()
   {
      return room.getSize()+1;
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
   
   

}//end class