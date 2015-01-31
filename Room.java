public class Room
{ 
   public int numOfItems=0;
   public String itemType;
   //public boolean hasHealthPotion=false;
   //public boolean hasVisionPotion=false;
   //public boolean hasTrap=false;
   public boolean hasBadGuy=false;

   public int locationRow;
   public int locationCol;
   public Room(int locationRow, int locationCol)
   {
   
      this.locationRow=locationRow;
      this.locationCol=locationCol;
   }
   public String getItemType()
   {
      return this.itemType;
   }//end of method
		
   // public boolean getHasHealthPotion()
   // {
      // return this.hasHealthPotion;
   // }//end of method
	
   public boolean getBadGuy()
   {
      return this.hasBadGuy;
   }//end of method  
   
   //find item type()
  //  public boolean random()
//       {
//          Random random= new Random();
//          return random.nextInt(10)==0;
//       }//end of method
   
}
