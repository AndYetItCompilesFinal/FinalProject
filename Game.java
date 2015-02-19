import java.util.* ;
public class Game
{
   
   
   public static void main(String[] args)
   {
      boolean win=false;
      List<String> list = new ArrayList<String>(Arrays.asList("Peter Pan","Mushu","Ballu"));
      LinkedList characters=new LinkedList(list);
      
      Scanner kb= new Scanner(System.in);
      System.out.println("Choose Your Character:");
      GoodGuy mainCharacter=chooseGoodGuy(characters,kb,list);
      //new party
      System.out.println("Choose A Party Member:");
      GoodGuy party1=chooseGoodGuy(characters,kb,list);
      System.out.println("Choose A Party Member:");
      GoodGuy party2=chooseGoodGuy(characters,kb,list);
      Party party=new Party(mainCharacter,party1,party2);
      //printStory(mainCharacter);
      //make the map
      Map map=new Map();
      Backpack pack=new Backpack();
      System.out.println(map.toString());
      Move move=new Move(map.map,party,pack);
      GameOptions run= new GameOptions(move,pack);
   	//System.out.println(map.toString());
   
   
   //maybe have the user pick magic, attack, or defense as their main choice
   //give player game options
   
   
   }//end of main
   
	
	
   public static GoodGuy chooseGoodGuy(LinkedList characters, Scanner kb, List<String> list)
   {
      int choice;
      int available=characters.size();
      GoodGuy party;
      String name;
      do{
      	//Gives user the character choices
         for(int i=0;i<available;i++)
         {
            System.out.println((i+1)+") "+characters.get(i));
         }
         System.out.print("Choice-->");
         choice=kb.nextInt();
         kb.nextLine();
         System.out.println();
         //checks for invalid choice
         if (choice<1 || choice>available)
         {
            System.out.println("I am sorry that is an invalid menu choice.");
            System.out.println("Please try again");
            System.out.println();
         }
         
      }while(choice<1 || choice>available);
      
      name=(characters.get(choice-1)).toString();
      System.out.println(name);
      //creates the character chosen
      if("Peter Pan".equals(name))
      {
         party=new PeterPan();
         characters.remove("Peter Pan");
         
      }
      else if("Mushu".equals(name))
      {
         party=new Mushu();
         characters.remove("Mushu");
         
      }
      else
      {
         party=new Ballu();
         characters.remove("Ballu");  
      }
      return party;
   }
   	
   public static void printStory(GoodGuy main)
   {
      System.out.println("Story");
   }
   
}

