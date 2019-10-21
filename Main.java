public class Main {
   

   public static void main (String[] args) {

   Arrangement agmt1 = new Arrangement("roskilde festival");
   Arrangement agmt2 = new Arrangement("bowling");
   Arrangement agmt3 = new Arrangement("Undervisning");
   Arrangement agmt4 = new Arrangement("Fis og ballade");
   
   Deltager del1 = new Deltager("Rasmus", "28182729");
   Deltager del2 = new Deltager("Hans", "28383828");
   Deltager del3 = new Deltager("Magnus", "28302823");
   Deltager del4 = new Deltager("Frederikke", "30210239");
   
   
   agmt1.addDeltager(del1);
   agmt1.addDeltager(del3);
   agmt1.addDeltager(del2);
   
   agmt2.addDeltager(del1);
   agmt3.addDeltager(del1);
   
   System.out.println(agmt1.printListe());
   System.out.println(del1.printListe());
   
   }


}