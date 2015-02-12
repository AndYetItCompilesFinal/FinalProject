import java.util.* ;
public class Move
{
   int currentRow;
   int currentCol;
   Room[][] map;
    	
   public Move(Room[][] map)
   {
      this.map=map;
      findEntrance();//gets starting position
   }
       
    
   public void findEntrance()
   {
      for(int row=0;row<map.length;row++)
      {
         for(int col=0;col<map[row].length;col++)
         {
            if(this.map[row][col].itemType().compareTo("I")==0)
            {
               this.currentRow=row;
               this.currentCol=col;
            }//end of if
         }//end of inner for loop
      }//end of outer for loop
   }//end of method
       
   public void executeRoom()
   {
      String temp;
      int choice;
      Scanner kb=new Scanner(System.in);
      for(int i=0;i<map[currentRow][currentCol].items.size();i++)
      {
         temp=(String)map[currentRow][currentCol].items.get(i);
         if(temp.equals("H"))
         {
            do{
               System.out.println("You have found a health potion");
               System.out.println("What would you like to do:");
               System.out.println("1. Use it");
               System.out.println("2. Put it in your backpack");
               System.out.println("3. Leave in room");	
               System.out.println();		  	
                
                
               System.out.print("Choice-->");
               choice=kb.nextInt();
               kb.nextLine();
               System.out.println();
               if (choice<1 || choice>3)
               {
                  System.out.println("I am sorry that is an invalid menu choice.");
                  System.out.println("Please try again");
                  System.out.println();
               }//end of if
            
            }while(choice<1 || choice>3);
            switch (choice)
            {
               case 1: 
                  //new health potion
                  //use potion
                  break;
               case 2:
                  //new health potion
                  //backpack.add(health potion);
                  break;
               default:
                  kb.nextLine();
            }//end of switch
         
         }//end of if
         if(temp.equals("W"))
         {
            System.out.println("You have found a weapon");
            do{
               System.out.println("What would you like to do:");
               System.out.println("1. Put it in your backpack");
               System.out.println("2. Leave in room");	
               System.out.println();		  	
                
                
               System.out.print("Choice-->");
               choice=kb.nextInt();
               kb.nextLine();
               System.out.println();
               if (choice<1 || choice>2)
               {
                  System.out.println("I am sorry that is an invalid menu choice.");
                  System.out.println("Please try again");
                  System.out.println();
               }
            }while(choice<1 || choice>2);
                    
            switch (choice)
            {
               case 1: 
                     //new weapon
                     //backpack.add(weapon)
                     //delete weapon from room
                  map[currentRow][currentCol].items.remove("W");
                  if(map[currentRow][currentCol].items.size()==0)
                  {
                     map[currentRow][currentCol].items.add("E");
                  }
                  break;
               default:
                  kb.nextLine();
            }//end of switch
         }//end of if
         if(temp.equals("B"))
         {
            System.out.println("There is a bad guy in the room!!");
            //battle
         }
         if(temp.equals("E"))
         {
            System.out.println("This room is empty");
         }
      }
       
       
       
       
   }//end
       
   public void changeDirection()
   {int choice;
      Scanner kb=new Scanner(System.in);
          
      do{
         System.out.println("Which direction would you like to go:");
         System.out.println("1.North");
         System.out.println("2.South");
         System.out.println("3.East");
         System.out.println("4.West");
         System.out.println("5.Go back to main menu");
         System.out.println();		  	
                
                
         System.out.print("Choice-->");
         choice=kb.nextInt();
         kb.nextLine();
         System.out.println();
                
         if (choice<1 || choice>5)
         {
            System.out.println("I am sorry that is an invalid menu choice.");
            System.out.println("Please try again");
            System.out.println();
         }
                
      }
                while (choice<1 || choice>5);
             
      switch (choice)
      {
         case 1: 
            if (currentRow>0)
            {
               moveNorth();
            }
            else
               System.out.println("Cannot move north");
            break;
         case 2:
            if (currentRow<4)
            {
               moveSouth();
            }
            else
               System.out.println("Cannot move south");
            break;
         case 3:
            if (currentCol<4)
            {
               moveEast();
            }
            else
               System.out.println("Cannot move east");
            break;
         case 4: 
            if (currentCol>0)
            {
               moveWest();
            }
            else
               System.out.println("Cannot move west");
            break;
         default:
            kb.nextLine();
      }
       
   }//end of method
       
   public void moveEast()
   {
      this.currentCol++;
      executeRoom();
   }
    	
   public void moveWest()
   {
      this.currentCol--; 
      executeRoom(); 
   }
    	
   public void moveSouth()
   {
      this.currentRow++;
      executeRoom(); 
   }
    	
   public void moveNorth()
   {
      this.currentRow--;
      executeRoom();   
   }
    	
    	
}//end of class
