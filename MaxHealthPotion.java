public class MaxHealthPotion extends Potion
{
   public MaxHealthPotion(Room room)
   {
      this();
      size++;
      this.room=room;
   }
   public MaxHealthPotion()
   {
      additionalHP=100;
   }
   public String toString()
   {
      return "Max Heath Potion";
   }

}