public class Level1Weapon extends Weapon
{
   public Level1Weapon(Room room)
   {
      this();
      this.room=room;
      size++;
   }
   public Level1Weapon()
   {
      attackDamage=10;
   }
   public String toString()
   {
      return "Level 1 Weapon";
   
   }
}//end of class