public class Level3Weapon extends Weapon
{

   public Level3Weapon(Room room)
   {
      this();
      this.room=room;
   }
   public Level3Weapon()
   {
      attackDamage=20;
   }
   public String toString()
   {
      return "Level 3 Weapon";
   
   }
   public int getSize()
   {
      return room.getSize()+1;
   }

}//end of class