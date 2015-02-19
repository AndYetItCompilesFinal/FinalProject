public class HealthPotion10 extends Potion
{
   public HealthPotion10(Room room)
   {
      this();
      this.room=room;
   }
   public HealthPotion10()
   {
      additionalHP=10;
   }
   public String toString()
   {
      return "10 HP Health Potion";
   }
   public int getSize()
   {
      return room.getSize()+1;
   }
}