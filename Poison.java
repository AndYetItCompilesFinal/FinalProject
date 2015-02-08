public class Poison extends PickupItems
{
   public Poison()
   {
      itemBehavior = new UsePoison();
   }
   
   public void display()
   {
      System.out.println(" has picked up a vile of poison.");
   }
}