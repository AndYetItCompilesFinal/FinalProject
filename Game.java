   import java.util.* ;
   public class Game
   {
      
      
      public static void main(String[] args)
      {
         boolean win=false;
         Characters characters=new Characters();
         
         GoodGuy mainCharacter=chooseGoodGuy(characters);
         //new party
         GoodGuy party1=chooseParty(characters);
         GoodGuy party2=chooseParty(characters);
         
         printStory(mainCharacter);
      
      
      //maybe have the user pick magic, attack, or defense as their main choice
      //give player game options
      
      
      }//end of main
      
   	
   	
   	
   	
   	
      public static GoodGuy chooseGoodGuy(Characters characters)
      {
         int choice;
         GoodGuy mainCharacter;
         Scanner kb= new Scanner(System.in);
         do{
            System.out.println("Choose Your Character:");
            System.out.println("1) Peter Pan");
            System.out.println("2) Mushu");
            System.out.println("3) Ballu");
            System.out.print("Choice-->");
            choice=getChoice(kb);
         }while(choice<1 || choice>3);
         if(choice==1)
         {
            mainCharacter= new PeterPan();
            characters.charlist.remove(0);
         }
         else if(choice==2)
         {
            mainCharacter= new Mushu();
            characters.charlist.remove(1);
         }
         else
         {
            mainCharacter= new Ballu();
            characters.charlist.remove(2);
            
         }
         return mainCharacter;
      }//end of chooseCharacter
   	
   	
   	
      public static GoodGuy chooseParty(Characters characters)
      {
         int choice;
         int available=characters.charlist.size();
         GoodGuy party;
         String name;
         Scanner kb= new Scanner(System.in);
         do{
            System.out.println("Choose A Party Member:");
            for(int i=0;i<available;i++)
            {
               System.out.println((i+1)+") "+characters.charlist.get(i));
            }
            choice=getChoice(kb);
            
         }while(choice<1 || choice>available);
         name=(characters.charlist.get(choice-1)).toString();
         System.out.println(name);
         if("Ballu".equals(name))
         {
            party=new PeterPan();
            characters.charlist.remove("Peter Pan");
            
         }
         else if("Mushu".equals(name))
         {
            party=new Mushu();
            characters.charlist.remove("Mushu");
            
         }
         else
         {
            party=new Ballu();
            characters.charlist.remove("Ballu");
            
         }
         return party;
      }
      
   	
      public static void printStory(GoodGuy main)
      {
         System.out.println("Story");
      }
      public static int getChoice(Scanner kb)
      {
         int choice=kb.nextInt();
         kb.nextLine();
         System.out.println();
         if (choice<1 || choice>3)
         {
            System.out.println("I am sorry that is an invalid menu choice.");
            System.out.println("Please try again");
            System.out.println();
         }
         return choice;
      }
   }
   
