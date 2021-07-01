
public enum MainMenuEnum {

	REGISTER(1, "직원등록"),
	SEARCH(2, "직원 검색"),
	EXIT(9, "종료");
	
	int code ;
	String message;
	
	MainMenuEnum(int code, String message ){
		
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
