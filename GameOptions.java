   import java.util.*;
   public class GameOptions
   {
      public Move move;
   	public boolean win;
      Backpack pack;
      public GameOptions(Move move, Backpack pack)
      {
         this.pack=pack;
      	this.move=move;
      	win=false;
      	run();
      }
      
      public void run()
      {
      	int choice;
      	Scanner kb= new Scanner(System.in);
         do{
            do{
               System.out.println("Please select from the following menu choices:");
               System.out.println("1.Move through the castle");
               System.out.println("2.Open Backpack");
               System.out.println("3.Quit");
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
               }
               
            } while (choice<1 || choice>3);
            
            switch (choice)
            {
               case 1: 
                  move.changeDirection();
                  break;
               case 2:
                 //backpack
                 System.out.println(pack);
                  break;
               default:
                  kb.nextLine();
            }
         }while (win==false);
      }//end of method
   }//end of class
