//패키지는 rt.jar로 압축가능 
//java.util 시간 ... awt는 자바gui프로그래밍,  javax.swing gui프로그래밍을 위한 스윙 패키지 
// java.util.*  java.util에 포함된 모든 것을 import한다 .
//package 모양, public class 원이면   root폴더/모양폴더/원.java 
//default 접근지시자는 동일한 package내에서는 접근이 가능 
//서로다른 패키지 접근할때 setter, getter를 사용해서 값을 읽어온다. 

public class A_CircleUsing {

	public static void main(String[] args) {
		
		team1.Circle c1 = new team1.Circle();
		c1.setRad(3.5);
		System.out.println("반지름 3.5의 넓이: " + c1.getArea());
		
		team2.Circle c2 = new team2.Circle();
		c2.setRad(3.8);
		System.out.println("반지름 3.8의  둘레 : " + c2.getPerimeter());

	}

}
