public class Rock extends PickupItems
{
   public Rock()
   {
      itemBehavior = new UseStats();
   }
   
   public void display()
   {
      System.out.println(" has picked up a rock.");
   }
}