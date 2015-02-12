import java.lang.Math;
import java.util.Scanner;

public class BattlePhase{
   public boolean startBattle(Party[] party, BadGuy enemy){
      boolean victory;
      
      while(party.defeated() !=true || enemies.defeated() != true){
         int choice;
         int attack;
         for(int i=0; i < 3 ;i++){
            System.out.println("It is " + party[i].toString() + " turn.");
            choice = displayMenu();
            if(choice == 1){
               int baseAttack;
               int damage;
               baseAttack = p[i].chooseAttack();
               damage = damage(party[i].getStr(), baseAttack);
               execute(enemy, damage);
            }else{
               //use an item
            }
         }
         villanTurn(enemy, party);
        
      }
      //enemy need to determine who to attack and generate damage. Apply if no dodge
      //continue until party is defeated or enemies are defeated
      if(party.defeated() == true){
         System.out.println("Your party was defeated.");
         return false;
      }else{
         System.out.println("Your party was victorious.");
         return true;
      }
   }   
   
   //returns damage value for the attack, takes in the characters strength value    
   public static int damage(int str, int base){
      int dmg = 0;
      int temp;
      for(int i = 1; i <=str; i++){
         dmg = dmg +((int)(Math.random() * (6 - 1) + 1));
      }
      dmg = dmg + str + base;
      return dmg;
   }
   
   //takes in dodge chance. If num generated is less than chance, then they dodged
   public static boolean dodge(double dodgeChance){
      double ran = Math.random();
      if(ran <= dodgeChance){
         return true;
      }else{
         return false;
      }
   }
   
   public static int displayMenu(){
      Scanner kb = new Scanner(System.in);
      System.out.println("Do you want to: ");
      System.out.println("1. Attack");
      System.out.println("2. Item");
      System.out.println("Enter your choice: ");
      int choice = kb.nextInt();
      return choice;      
   }
   
   public static int chooseAttack(){
      System.out.println("Choose your Attack!");
      System.out.println("1.Attack 1.");
      System.out.println("2.Attack 2.");
      System.out.println("3.Attack 3.");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number now: ");
      int attack = sc.nextInt();
      return attack;
   }
   
   public static void excecute(BadGuy[] enemy, int damage){
      boolean dodgeSuccess = dodge(enemy.getDef());
      if (dodgeSuccess == true){
         System.out.println(enemy.toString() + " managed to dodge the attack!");
      }else{
         //do damage
         System.out.println(enemy.toString() + " got hit by the attack.");
      }
   }
   
   public static void villanTurn(BadGuy enemy){
      int baseAttack;
      int damage;
      baseAttack = enemy.chooseAttack;
      damage = damage(enemy.getStr(), baseAttack);
      int choice = ((int)(Math.random() * (3 - 1)));
      if(dodge(party[choice]) = true){
         System.out.println("They dodged the attack.");
      }else{
         System.out.println(party[choice].toString() + " was hit with the attack for a total of " + damage + " damage!");
         party[choice].setHp() = party[choice].getHp() - damage;
      } 
   }
            
   
   
}