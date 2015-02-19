public abstract class RoomDecorator extends Room
{
   Room room;
   public abstract String toString();

   public String getDescription()
   {
      return this.room.getDescription() +", "+ toString();
   }
   public Room getPrev()
   {
      return room;
   }
}