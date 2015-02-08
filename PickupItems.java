public abstract class PickupItems
{
   ItemBehaviors itemBehavior;
   
   public PickupItems()
   {
   
   }
   
   public abstract void display();
   
   public void performHeal()
   {
      itemBehavior.heal();
   }
   
   public void performPoison()
   {
      itemBehavior.poison();
   }
   
   public void performEat()
   {
      itemBehavior.heal();
   }
   
   public void useAttackItem()
   {
      itemBehavior.stats();
   }
   
   public void useKey()
   {
      itemBehavior.key();
   }
}