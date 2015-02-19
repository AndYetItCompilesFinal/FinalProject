import java.util.* ;
public class Move
{
   int currentRow;
   int currentCol;
   Room[][] map;
    Party party;
    Backpack pack;
   public Move(Room[][] map,Party party,Backpack pack)
   {
      this.map=map;
      this.pack=pack;
       this.party=party;
      findEntrance();//gets starting position
   }
       
    
   public void findEntrance()
   {
      for(int row=0;row<map.length;row++)
      {
         for(int col=0;col<map[row].length;col++)
         {
            if(this.map[row][col] instanceof Entrance)
            {
               this.currentRow=row;
               this.currentCol=col;
            }//end of if
         }//end of inner for loop
      }//end of outer for loop
   }//end of method
       
   public void executeRoom()
   {
      int choice;
      Scanner kb=new Scanner(System.in);
      System.out.println(map[currentRow][currentCol].getDescription());
      for(int i=0;i<map[currentRow][currentCol].getSize();i++)
      {
         if(map[currentRow][currentCol] instanceof Potion)
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
                  pack.list.add((Potion)map[currentRow][currentCol]);
                  break;
               default:
                  kb.nextLine();
            }//end of switch
         
         }//end of if
         if(map[currentRow][currentCol] instanceof Weapon)
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
                     pack.list.add((Weapon)map[currentRow][currentCol]);
                  break;
               default:
                  kb.nextLine();
            }//end of switch
         }//end of if
         if(map[currentRow][currentCol] instanceof BadGuy)
         {
             System.out.println("There is a bad guy in the room!!");
             BadGuy b = new Maleficent();
             BattlePhase.startBattle(party, b);
         }
         if(map[currentRow][currentCol] instanceof Empty)
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
