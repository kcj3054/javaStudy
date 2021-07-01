package menus;

import java.util.Scanner;
import menus.MainMenuEnum;
import utils.Utils;

public class Menu {
   public MainMenuEnum MainMenu(Scanner s) {
      System.out.println("");
      System.out.println("======== Main Menu ===");
      for(MainMenuEnum m : MainMenuEnum.values()) {
         System.out.println("  " + m.getCode() + ". " + m.getMessage());
      }

      int n;
      MainMenuEnum select = null;
      while(true) {
         n = Utils.checkInputInteger(s, "����>>> ");
         
         boolean valid = false;
         for(MainMenuEnum m : MainMenuEnum.values()) {
            if(n == m.getCode()) {
               valid = true;
               select = m;
               break;
            }
         }
         
         if(valid) {
            break;
         }
         System.out.println("Invalid Input. Try again");
      }
      
      return select;
   }


   // public RegisterMenuEnum RegisterMenu(Scanner s) { ... } �ۼ�

   // public SearchMenuEnum SearchMenu(Scanner s) { ... } �ۼ�
}