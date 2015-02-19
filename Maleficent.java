public class Maleficent extends BadGuy
{
   public Maleficent(Room room)
   {
      this();
      this.room=room;
   }
   public Maleficent()
   {
      maxhp = 90;
      hp = 90;
      str = 5;
      def = .20;
      spd = 4;
   }
   public int getSize()
   {
      return room.getSize()+1;
   }
   
   public String toString()
   {
      return("Maleficent");
   }
   
   public int attack1(){
      System.out.println("Maleficent bestowed a sleeping curse on you!");
      return 0;
   }

   public int attack2(){
      System.out.println("Maleficent hit you with her staff!");
      return 8;
   }

   public int attack3(){
      System.out.println("Maleficent turned into a dragon and smacked you with her tail!");
      return 15;
   }
   
  


   
}//end class