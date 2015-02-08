public class Cake extends PickupItems
{
   public Cake()
   {
      itemBehavior = new UseHeal();
   }
   
   public void display()
   {
      System.out.println(" has picked up some cake.");
   }
}