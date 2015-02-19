public class HealthPotion15 extends Potion
{
   public HealthPotion15(Room room)
   {
      this();
      this.room=room;
   }
   public HealthPotion15()
   {
      additionalHP=15;
   }
   public String toString()
   {
      return "15 HP Health Potion";
   }
   public int getSize()
   {
      return room.getSize()+1;
   }
}