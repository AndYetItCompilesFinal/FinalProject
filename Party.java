public class Party {
   GoodGuy[] party;
   
   public Party(GoodGuy a, GoodGuy b, GoodGuy c){
	party = new GoodGuy[3];
      party[0] = a;
      party[1] = b;
      party[2] = c;
   }
   
   public GoodGuy getParty(int index){
      return party[index];
   }
   
   public void setParty(GoodGuy hero, int index){
      //party[index].goodBye();
      party[index] = hero;
   }
   
   public String toString(){
     String str = ("Your party consists of" + party[0].toString()+ ", " + party[1].toString() + ", and " + party[2].toString() + ". ");
	  return str;
   }
   
   // defeated();
}
