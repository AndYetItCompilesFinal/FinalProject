import java.util.*;
public class Map
{
   public Room[][] map;
   public Map()
   {
      this.map= new Room[5][5];
      initialize();
   }
	
   public void initialize()
   {
      entrance();
      exit();
      levelWeapon();
      for (int row=0;row<map.length;row++)
      {
         for(int col=0;col<map[row].length;col++)
         {
            if (this.map[row][col]==null)
            {
               this.map[row][col]=this.map[row][col];
               this.map[row][col]=new GenericRoom(row,col);
               this.map[row][col]=generateRoom(this.map[row][col]);
            }
         }//inner for loop
      
      }//outer for loop
   
   }
   public Room generateRoom(Room room)
   {

      if(randomItem())
      {
         room= new HealthPotion10(room);
      }
      if(randomItem())
      {
            room= new HealthPotion15(room);
      }
      if(randomItem())
      {
      	room= new MaxHealthPotion(room);
      }
      if(randomItem())
      {
      	room= new Hades(room);
      }
      if(randomItem())
      {
      	room= new Gaston(room);
      }
      if(randomItem())
      {
      	room= new Maleficent(room);
      }
      if(room.getDescription().compareTo("Room")==0)
      {
         room= new Empty(room);
      }
      return room;
   }
   public void entrance()
   {
      int row=random();
      int col=random();
      this.map[row][col]=new Entrance(row,col);
   }
   public void exit()
   {
      int row,col;
      do
      {
         row=random();
         col=random();
      }while(this.map[row][col]!=null);
      this.map[row][col]=new Exit(row,col);
   }
   public void levelWeapon()
   {
      int row,col;
      do
      {
         row=random();
         col=random();
      }while(this.map[row][col]!=null);
      this.map[row][col]=new GenericRoom(row,col);
      this.map[row][col]= new Level1Weapon(this.map[row][col]);
      
   }
   public int random()
   {
      Random random= new Random();
      return random.nextInt(5);
   }//end of method
   public boolean randomItem()
   {
      Random random= new Random();
      return random.nextInt(10)==0;
   }//end of method
   
   public String itemType(Room room)
   {
      if(room.getSize()>1)
      {
         return "M";
      }
      if(room instanceof Entrance)
      {
         return "I";
      }
      if(room instanceof Exit)
      {
         return "O";
      }
      if(room instanceof Empty)
      {
         return "E";
      }
      if(room instanceof Potion)
      {
         return "P";
      }
      if(room instanceof Weapon)
      {
         return "W";
      }
      if(room instanceof BadGuy)
      {
         return "B";
      }
         return "";
   }
   
   
   
   
   
   
   
   
      public String toString()
      {
         String result="***********";
         for (int row=0;row<this.map.length;row++)
         {
            result=result+"\n*";
            for(int col=0;col<this.map[row].length;col++)
            {
               if(col<map[row].length-1)
               {
                  result=result+itemType(this.map[row][col])+"|";
               }
               else
                  result=result+itemType(this.map[row][col])+"*";
            }//end of first inner for loop
            result=result+"\n*";
            for(int col2=0;col2<this.map[row].length;col2++)
            {	
               if(row<4)
               {
                  result=result+"-*";
               }
            }//end of second inner for loop
         }//end of outer for loop
         result=result+"**********";
      	
         return result;
      
      }//end of method

}//end of class