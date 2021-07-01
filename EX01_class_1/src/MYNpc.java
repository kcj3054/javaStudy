//클래스 정의 

class Npc{
//필드
	String name;
	int hp;
	//메서드 - 동작 
	void say() {
		System.out.println("안녕하세요");
	}
}
public class MYNpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Npc saram1 = new Npc();
		
		saram1.name = "경비";
		saram1.hp = 100;
		System.out.println(saram1.name + ":"  + saram1.hp);
		saram1.say();
	}

}
