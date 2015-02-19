public class Level1Weapon extends Weapon
{
   public Level1Weapon(Room room)
   {
      this();
      this.room=room;
   }
   public Level1Weapon()
   {
      attackDamage=10;
   }
   public String toString()
   {
      return "Level 1 Weapon";
   
   }
      public int getSize()
   {
      return room.getSize()+1;
   }
}//end of class