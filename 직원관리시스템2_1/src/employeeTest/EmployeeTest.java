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
               
               // 유효한 값 입력 
               boolean valid = false;
               System.out.println("======== Register Menu ===");
               System.out.println("11.정규직 등록");
               System.out.println("12.임시직 등록");
               System.out.println("19.돌아가기");
               System.out.println("선택 >>>");
               num = scanner.nextInt();
               switch(num) {
               case 11 :      System.out.println(">>>정규직 등록<<<"); break;
               case 12 :      System.out.println(">>>임시직 등록<<<");break;
               case 19 : Menu menu3 = new Menu();
               menu3.MainMenu(scanner);
               break;
                  default : valid = true;System.out.println("Invalid Input. Try again"); break;
                  
               }
               
            }
      
            
            // 직원 등록 메뉴 출력 및 입력 처리
         }
         else if(mm == MainMenuEnum.SEARCH) {
               while(true) {
               
               // 유효한 값 입력 
               boolean valid = false;
               System.out.println("======== Search Menu ===");
               System.out.println("21.일괄검색");
               System.out.println("29.돌아가기");
               System.out.println("선택 >>>");
               num = scanner.nextInt();
               switch(num) {
               case 21 :      System.out.println(">>>일괄 검색<<<"); break;
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