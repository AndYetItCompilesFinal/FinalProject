public class Empty extends RoomDecorator
{
   Room room;
   public Empty(Room room)
   {
      this.room=room;
   }
   public String toString()
   {
      return "Empty"; 
   }


}//end of class