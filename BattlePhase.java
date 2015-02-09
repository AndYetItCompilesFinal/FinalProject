import java.lang.Math;

Character[] order;

public class BattlePhase{
   //need to make party more generic to support enemies
   public boolean startBattle(Party[] party, Party[] enemies){
      boolean victory;
      while(party.defeated !=true || enemies.defeated != true){
      
      }
      //needs to determine battle order, probable with array of speed
      //needs to have a way for the user to pick their attacks
      //needs to generate damage and have it apply to enemy if attack hits
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
   
   public static void order(Party[] party, Party[] enemies){
      //sorts based on speed stat
      
   }
   
   
   //returns damage value for the attack, takes in the characters strength value    
   public static int damage(int str){
      int dmg = 0;
      int temp;
      for(int i = 1; i <=str; i++){
         dmg = dmg +((int)(Math.random() * (6 - 1) + 1));
      }
      dmg = dmg + str;
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
   
   
}