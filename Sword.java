public class Sword extends PickupItems
{
   public Sword()
   {
      itemBehavior = new UseStats();
   }
   
   public void display()
   {
      System.out.println(" has picked up a sword.");
   }
}