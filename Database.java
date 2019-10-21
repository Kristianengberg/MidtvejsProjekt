import java.util.Scanner;
import java.util.ArrayList;

public class Database {

   private ArrayList<Deltager> deltagerList = new ArrayList<Deltager>();
   private ArrayList<Arrangement> arrangList = new ArrayList<Arrangement>();

   public Database(){
   
   }
   
   public void start(){
     
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("---Vaelg en af foelgende--- \n 1: Bruger - 2: Arrangement - 3: Exit");
      
      
      String keyInput = terminalInput.nextLine();
   
      switch (keyInput) {
         case "1":
            bruger();
            
            break;
      
         case "2":
            arrangement();
            
            break;
      
         case "3":
            exit();
            break;
      
         default:
            break;
      }
   
   }

   private void bruger(){
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("---Vaelg en af foelgende--- \n 1: Opret - 2: Print Brugere 3: Tilbage");
      
      
      String keyInput = terminalInput.nextLine();
      
      switch (keyInput) {
         case "1":
            opretBruger();
            
            break;
         case "2":
            printListeDel();
            
            break;
         case "3":
            start();
            break;
      
      
         default:
            break;
      }
   }
   
   private void arrangement(){
     
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("---Vaelg en af foelgende (A)--- \n 1: Opret - 2: Print Arrangementer - 3: Tilbage");
      
      
      String keyInput = terminalInput.nextLine();
   
      switch (keyInput) {
         case "1":
            opretArrangement();
            break;
        case "2":
            printListeArr();
            break;    
         case "3":
            start();
            break;
      
         default:
            break;
      }
   }

   private void exit(){
   
   return;
   }
   
   
   private void opretBruger(){
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("---Hvad er navnet på brugeren--- \n");
      
      
      String keyInput = terminalInput.nextLine();
      
      String tempName = keyInput;
      
    
      System.out.println("---Hvad er brugerens telefonnummer--- \n");
      
      
      keyInput = terminalInput.nextLine();
      
      String tempNumber = keyInput;
      
      this.deltagerList.add(new Deltager(tempName, tempNumber));
      
      start();
      
   
   }
   
   
      private void opretArrangement(){
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("---Hvad er navnet på Arrangementet--- \n");
      
      
      String keyInput = terminalInput.nextLine();
      
      String tempName = keyInput;

      this.arrangList.add(new Arrangement(tempName));
      
      start();
   }
   
   public void printListeArr(){
   
      for(int i = 0; i < arrangList.size(); i++){
         System.out.println(this.arrangList.get(i).getName());
         
      }
      start();
   
   }
   
   public void printListeDel(){
   
      for(int i = 0; i < deltagerList.size(); i++){
         System.out.println(this.deltagerList.get(i).getName());
         
      }
      start();
   }
   

}


