package menus;

public enum MainMenuEnum {
   REGISTER(1, "���� ���"),
   SEARCH(2, "���� �˻�"),
   EXIT(9, "����");
   
   int code;
   String message;
   
   MainMenuEnum(int code, String message) {
      this.code = code;
      this.message = message;
   }
   
   public int getCode() {
      return code;
   }
   
   public String getMessage() {
      return message;
   }
}