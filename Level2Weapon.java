public class Level2Weapon extends Weapon
{

   public Level2Weapon(Room room)
   {
      this();
      this.room=room;
   }
   public Level2Weapon()
   {
      attackDamage=15;
   }
   public String toString()
   {
      return "Level 2 Weapon";
   
   }
   public int getSize()
   {
      return room.getSize()+1;
   }
}//end of class