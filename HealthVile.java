public class HealthVile extends PickupItems
{
   public HealthVile()
   {
      itemBehavior = new UseHeal();
   }
   
   public void display()
   {
      System.out.println(" has picked up a health vile.");
   }
   
}