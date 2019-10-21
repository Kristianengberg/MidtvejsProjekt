import java.util.ArrayList;

public class Deltager {
   private String name;
   private String number;
   private ArrayList<String> arrangListe = new ArrayList<String>();
   
   public Deltager(String name, String number) {
      this.name = name;
      this.number = number;
   }
   public String getName(){
      return this.name;
   }
   public void setNumber(String number){
      this.number = number;
   }
   public void deleteNumber(){
      this.number = " ";
   }
   
   public void addArrang(String arrang){
      arrangListe.add(arrang);
   }
   
   public String printListe(){
      int arraySize = arrangListe.size();
      String tempListe = this.name + " skal til: ";
      for(int i = 0; i < arraySize; i++){
         tempListe = tempListe + arrangListe.get(i) + " ";
      }
      
      return tempListe;
   }
}