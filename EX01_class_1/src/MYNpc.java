//Ŭ���� ���� 

class Npc{
//�ʵ�
	String name;
	int hp;
	//�޼��� - ���� 
	void say() {
		System.out.println("�ȳ��ϼ���");
	}
}
public class MYNpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Npc saram1 = new Npc();
		
		saram1.name = "���";
		saram1.hp = 100;
		System.out.println(saram1.name + ":"  + saram1.hp);
		saram1.say();
	}

}
