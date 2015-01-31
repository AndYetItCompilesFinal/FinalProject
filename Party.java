public class Party {
   goodGuy[] party;
   
   public Party {
      party = new goodGuy[3];
   }
   
   public Party(goodGuy a, goodGuy b, goodGuy c){
      party[0] = a;
      party[1] = b;
      party[3] = c;
   }
   
   public goodGuy getParty(int index){
      return party[index];
   }
   
   public void setParty(goodGuy hero, int index){
      //party[index].goodBye();
      party[index] = hero;
   }
   
   public String toString(){
     str = ("Your party consists of" + party[0].toString()+ ", " + party[1].toString() + ", and " + party[2].toString() + ". ");
   }
}