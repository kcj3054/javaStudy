public class Enum2 {

	
	public static void main(String[] args) {
		
		MainMenuEnum menu = MainMenuEnum.EXIT;
		
		System.out.println(menu.getCode() + " : " + menu.getMessage());
		System.out.println(menu.name());
		System.out.println(menu.ordinal());
		
		for(MainMenuEnum m : MainMenuEnum.values()) {
			
			System.out.println(" " + m.getCode() + "." + m.getMessage());
			
		}
	}

}
