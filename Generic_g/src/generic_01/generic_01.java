package generic_01;

//Ÿ�� �Ű� ������ �⺻Ÿ���� ����Ҽ� ���� ����Ŭ������ ��밡���ϴ� 
//�÷����� ���׸�Ÿ���� ����Ѵ� 
//Ÿ�� �Ű������� ��Ÿ���� �ڷ����� ��ü�� ���� �Ұ� 

public class generic_01<T> {

	T data;
	
	T get() {
		return data;
	}
	
	void set(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {

		//��ü���� Ÿ���� �����Ͽ� ���� �� ��ü ���� 
		generic_01<String> sObj = new generic_01<>();
		sObj.set("java");
		
		//Ÿ�� t�� integer ���� 
		
		generic_01<Integer> iObj = new generic_01<>();
		iObj.set(7);
	}

}
