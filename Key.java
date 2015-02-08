public class Key extends PickupItems
{
   public Key()
   {
      itemBehavior = new UseKey();
   }  
   
   public void display()
   {
      System.out.println(" has picked up a key.");
   }
   
   
}