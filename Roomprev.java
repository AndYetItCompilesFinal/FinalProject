 //Mary Floyd
  
  //creates a room with certain items or no items at all with in it
  
  
   import java.util.*;
   public class Room
   {
      public int numOfItems=0;
      public String itemType;
      public boolean hasHealthPotion=false;
      public boolean hasVisionPotion=false;
      public boolean hasTrap=false;
		public boolean hasMonster=false;
      public int locationRow;
      public int locationCol;
   
      public Room(String itemType, int locationRow, int locationCol)
      {
         if (itemType.compareTo("E")==0)
         {
            this.itemType=findItemType();
         }//end of if
         if (itemType.compareTo("I")==0||itemType.compareTo("O")==0||itemType.compareTo("K")==0)
         {
            this.itemType=itemType;
         }
         this.locationRow=locationRow;
         this.locationCol=locationCol;
      }//end of constructor
   
	
		public String getItemType()
		{
		return this.itemType;
		}//end of method
		
		public boolean getHasHealthPotion()
		{
		return this.hasHealthPotion;
		}//end of method
	
		public boolean getHasVisionPotion()
		{
		return this.hasVisionPotion;
		}//end of method
		public boolean getHasMonster()
		{
		return this.hasMonster;
		}//end of method
   
      public String findItemType()
      {
         roomItems();
         
         if(numOfItems>1)
         {
            return "M";
         }
         if(hasHealthPotion)
         {
            return "H";
         }
         if(hasVisionPotion)
         {
            return "V";
         }
         if(hasTrap)
         {
            return "T";
         }
			if(hasMonster)
			{
			return "X";
			}
         return "E";
      	   
      }//end of method
      
      public void roomItems()
      {
         if (random())
         {
            this.numOfItems++;
            this.hasHealthPotion=true;
         }//end of if
         if (random())
         {
            this.numOfItems++;
            this.hasVisionPotion=true;
         }//end of if
         if (random())
         {
            this.numOfItems++;
            this.hasTrap=true;
         }//end of if 
			if (random())
			{
			this.numOfItems++;
			this.hasMonster=true;
			}//end of if
      
      }//end of method
   
      public boolean random()
      {
         Random random= new Random();
         return random.nextInt(10)==0;
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
