public class Map
{
   public Room[][] map;
   public Map()
   {
      this.map= new Room[5][5];
   }
   
   public void showMap(){
      for(int i = 0; i < map.length; i++){
         for(int j = 0; j < map[i].length; j++){
            System.out.print(map[i][j]);
         }
         System.out.println("");
      }
   }
}
