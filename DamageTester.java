// wasn't sure where to put the attack method

import java.lang.Math;

public class DamageTester{

   public static void main(String [] args){
      int total;
      for(int i = 1; i < 6; i++){
           System.out.println("Damage with strength " + i + ": ");
           total = damage(i);
           System.out.print(total + ", ");
           total = damage(i);
           System.out.print(total + ", ");
           total = damage(i);
           System.out.print(total + "\n");
      }       
   
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
}