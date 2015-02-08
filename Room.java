     import java.util.*;
   public class Room
   { 
      public ArrayList items;
   
      public int locationRow;
      public int locationCol;
      public Room(String itemType, int locationRow, int locationCol)
      {
         items=new ArrayList();
         if (itemType.compareTo("E")==0)
         {
            generateItems();
         }//end of if
         if (itemType.compareTo("I")==0||itemType.compareTo("O")==0)
         {
            items.add(itemType);
         }
         this.locationRow=locationRow;
         this.locationCol=locationCol;
      }
   
      public void generateItems()
      {
      	if(random())
      	{
      		//health potion
      		items.add("H");
      	}
      	if(random())
      	{
      		items.add("B");
      		//badguy
      	}
      	if(random())
      	{
      		items.add("W");
      		//weapon
      	}
      	else
      	{
      		items.add("E");
      	}
      }
   
      public boolean random()
      {
         Random random= new Random();
         return random.nextInt(10)==0;
      }//end of method
      	
   		public String itemType()
   		{
   			if(items.size()>1)
   			{
   			return "M";
   			}
   			else
   			{
   				return (String)items.get(0);
   			}
   			
   		}
   
   
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
               room=room+"\n|"+itemType();
            }
            else
            {
               room=room+"\n*"+itemType();
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
 
