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
         for (int row=0;row<map.length;row++)
         {
            for(int col=0;col<map[row].length;col++)
            {
               if (this.map[row][col]==null)
               {
                  this.map[row][col]=new Room("E",row,col);
               }
            }//inner for loop
         
         }//outer for loop
      
      }
		
      public void entrance()
      {
         int row=random();
         int col=random();
         this.map[row][col]=new Room("I",row,col);
      }
      public void exit()
      {
         int row=random();
         int col=random();
         while(this.map[row][col]!=null)
         {
            row=random();
            col=random();
         }
         this.map[row][col]=new Room("O",row,col);
      }
      public int random()
      {
         Random random= new Random();
         return random.nextInt(5);
      }//end of method
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
                  result=result+this.map[row][col].itemType()+"|";
               }
               else
                  result=result+this.map[row][col].itemType()+"*";
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
   
   }
