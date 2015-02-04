   public class Room
   { 
      public int numOfItems=0;
      public String itemType;
      public boolean hasBadGuy=false;
   
      public int locationRow;
      public int locationCol;
      public Room(String itemType, int locationRow, int locationCol)
      {
      	this.itemType=itemType;
         this.locationRow=locationRow;
         this.locationCol=locationCol;
      }
      public String getItemType()
      {
         return this.itemType;
      }//end of method
   	
      public boolean getBadGuy()
      {
         return this.hasBadGuy;
      }//end of method  
   
      public String toString()
      {
         String room;
         if (locationRow!=0)
         {
            room= "*-*";
         }
         else
         {
            room= "***";
         }
         if (locationCol!=0)
         {
            room=room+"\n|"+this.itemType;
         }
         else
         {
            room=room+"\n*"+this.itemType;
         }
         if (locationCol!=4)
         {
            room=room+"|\n";
         }
         else
         {
            room=room+"*\n";
         }
         if(locationRow!=4)
         {
            room=room+"*-*";
         }
         else
         {
            room=room+"***";
         }
         return room;
      }//end of method
   
   
   
   
   
   
   }//end of class
