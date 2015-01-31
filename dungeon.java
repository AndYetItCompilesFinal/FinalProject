 //Mary Floyd
   //designs a class with a twod array of type Room
   import java.util.*;
   
   public class Dungeon
   {
      public Room[][] dungeon;
   
   
      public Dungeon()
      {
         this.dungeon=new Room[5][5];
         initializeDungeon();
      }
   
      public void initializeDungeon()
      {
         entrance();
         exit();
         key();//fist key
         key();//secong key
         for (int row=0;row<dungeon.length;row++)
         {
            for(int col=0;col<dungeon[row].length;col++)
            {
               if (this.dungeon[row][col]==null)
               {
                  this.dungeon[row][col]=new Room("E",row,col);
               }
            }//inner for loop
         
         }//outer for loop
      	
      }//end of method
      
      public Room[][] getDungeon()
      {
         return this.dungeon;
      }
   	
      public void entrance()
      {
         int row=random();
         int col=random();
         this.dungeon[row][col]=new Room("I",row,col);
      }
      public void exit()
      {
         int row=random();
         int col=random();
         while(this.dungeon[row][col]!=null)
         {
            row=random();
            col=random();
         }
         this.dungeon[row][col]=new Room("O",row,col);
      }  
   	
      public void key()
      {
         int row=random();
         int col=random();
         while(this.dungeon[row][col]!=null)
         {
            row=random();
            col=random();
         }
         this.dungeon[row][col]=new Room("K",row,col);
      }
   
      public int random()
      {
         Random random= new Random();
         return random.nextInt(5);
      }//end of method
   
   
   
      public String toString()
      {
         String result="***********";
         for (int row=0;row<this.dungeon.length;row++)
         {
            result=result+"\n*";
            for(int col=0;col<this.dungeon[row].length;col++)
            {
               if(col<dungeon[row].length-1)
               {
                  result=result+this.dungeon[row][col].getItemType()+"|";
               }
               else
                  result=result+this.dungeon[row][col].getItemType()+"*";
            }//end of first inner for loop
            result=result+"\n*";
            for(int col2=0;col2<this.dungeon[row].length;col2++)
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
