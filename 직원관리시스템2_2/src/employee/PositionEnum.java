package employee;

public enum PositionEnum {
	DIRECTOR(21, "이사"),
	GENERAL_MANAGER(22, "부장"),
	MANAGER(23, "과장"),
	ASSISTANT_MANAGER(24, "대리"),
	STAFF(25, "사원");

	int code;
	String position;
	
	PositionEnum(int code, String position) {
		this.code = code;
		this.position = position;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getPosition() {
		return position;
	}
}
