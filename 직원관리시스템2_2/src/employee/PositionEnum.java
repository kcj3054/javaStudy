package employee;

public enum PositionEnum {
	DIRECTOR(21, "�̻�"),
	GENERAL_MANAGER(22, "����"),
	MANAGER(23, "����"),
	ASSISTANT_MANAGER(24, "�븮"),
	STAFF(25, "���");

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
