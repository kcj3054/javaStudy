package employeeTest;
import java.util.Scanner;
import menus.Menu;
import utils.Utils;
import menus.MainMenuEnum;

public class EmployeeTest {

   public static void main(String[] args) {
      Menu menu = new Menu();
      int num;

      Scanner scanner = new Scanner(System.in);
      while(true) {
         MainMenuEnum mm = menu.MainMenu(scanner);
         if(mm == MainMenuEnum.REGISTER) {
            while(true) {
               
               // ��ȿ�� �� �Է� 
               boolean valid = false;
               System.out.println("======== Register Menu ===");
               System.out.println("11.������ ���");
               System.out.println("12.�ӽ��� ���");
               System.out.println("19.���ư���");
               System.out.println("���� >>>");
               num = scanner.nextInt();
               switch(num) {
               case 11 :      System.out.println(">>>������ ���<<<"); break;
               case 12 :      System.out.println(">>>�ӽ��� ���<<<");break;
               case 19 : Menu menu3 = new Menu();
               menu3.MainMenu(scanner);
               break;
                  default : valid = true;System.out.println("Invalid Input. Try again"); break;
                  
               }
               
            }
      
            
            // ���� ��� �޴� ��� �� �Է� ó��
         }
         else if(mm == MainMenuEnum.SEARCH) {
               while(true) {
               
               // ��ȿ�� �� �Է� 
               boolean valid = false;
               System.out.println("======== Search Menu ===");
               System.out.println("21.�ϰ��˻�");
               System.out.println("29.���ư���");
               System.out.println("���� >>>");
               num = scanner.nextInt();
               switch(num) {
               case 21 :      System.out.println(">>>�ϰ� �˻�<<<"); break;
               case 29 : Menu menu3 = new Menu();
               menu3.MainMenu(scanner);
               break;
                  default : valid = true;System.out.println("Invalid Input. Try again"); break;
                  
               }
               }
         }
         else if(mm == MainMenuEnum.EXIT) {
            System.out.print("Good BYE!");
            scanner.close();
            break;
         }
      }
      
      scanner.close();
   }
}