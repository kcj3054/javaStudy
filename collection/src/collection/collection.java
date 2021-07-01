package collection;

import java.util.Vector;

//컬렉션은 자료 구조를 구현한 클래스 , 객체만 저장 그래서 기본타입은 wrapper클래스 사용

//collection 인터페이스의 주요 메소드
//int size() 원소 개수 반환, boolean isEmpty() 원소없으며 true반환, 
//boolean add(E e) 원소추가하고 결과반환 , remove, Iterator<E> iterator() 
//void clear() 컬렉션 모든 원소 삭제 

//제네릭은 자료형 정해두지않고 객체새성 메소드 생성할때 정해진다 

//vector 클래스 
//데이터 추가, 삭제, 삽입 ㅇㅇ 
//vector() 백체 객체 생성, 10개 단위로 벡터 크기 변경 
//vector(int size, int capacity) 
//size는 초기크기, size capacity, capacity는 용량, size는 저장되어있는 크기 

//v.set(1, -5) set은 값을 갱신하는 것이다. 인덱스1번에 -5를 삽입  


//void addElement(Object o) 원소추가(마지막 위치) 

public class collection {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		
		v.add(3);
		v.add(2);
		
		int sum = 0;
		
		for(int i= 0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}

	}

}
