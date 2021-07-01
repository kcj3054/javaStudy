import java.util.Iterator;
import java.util.*;

//LinkedList<E>의 주요 메소드 
// E remove(), E elemet() 차이는 remove는 검색, 삭제, element는 검색만한다 
//E poll() queue의 헤더 원소를 검색 및 제거 
//E peek() queue의 헤더 원소를 검색 
// boolean offer(E e ) list의 마지막 위치에 원소 삽입 
////////////////////////////////////////////////////
//collection 클래스 , sort, reverse, shuffle, binarySearch

public class LinkedList2 {

	public static void main(String[] args) {
	
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("사과");
		myList.add("바나나");
		
		myList.add(0, "망고");
		myList.add(2, "감귤");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "사과");
		
		
	}

}
