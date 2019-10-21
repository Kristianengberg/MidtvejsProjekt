import java.util.ArrayList;

public class Arrangement {

   private ArrayList<String> deltagerListe = new ArrayList<String>();
   private String name;
   
   public Arrangement(String name){
      this.name = name;
   }
   
   public String getName(){
      return this.name;
   }
   
   public void addDeltager(Deltager deltager){
      deltagerListe.add(deltager.getName());
      deltager.addArrang(this.name);
   }
   
   public String printListe(){
      int arraySize = deltagerListe.size();
      String tempListe = "Disse personer skal til "+this.name + ": ";
      for(int i = 0; i < arraySize; i++){
         tempListe = tempListe + deltagerListe.get(i) + " ";
      }
      
      return tempListe;
   }
   
   

}