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
      //party[index].hello();
   }
   
   public String toString(){
     String str = ("Your party consists of" + party[0].toString()+ ", " + party[1].toString() + ", and " + party[2].toString() + ". ");
	  return str;
   }
   
   //returns a true if party is defeated
   public boolean defeated(){
      boolean gameOver;
      if(party[0].hp >= 0){
         gameOver = false;
      }else if(party[1].hp >=0){
         gameOver = false;
      }else if(party[2].hp >= 0){
         gameOver = false;
      }else{
         gameOver = true;
      }
      return gameOver;
   }
      
}
