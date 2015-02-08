public class BownArrow extends PickupItems
{
   public BownArrow()
   {
      itemBehavior = new UseStats();
   }
   
   public void display()
   {
      System.out.println(" has picked up a bow and some arrows.");
   }
}