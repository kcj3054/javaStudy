import java.util.Iterator;
import java.util.*;

//LinkedList<E>�� �ֿ� �޼ҵ� 
// E remove(), E elemet() ���̴� remove�� �˻�, ����, element�� �˻����Ѵ� 
//E poll() queue�� ��� ���Ҹ� �˻� �� ���� 
//E peek() queue�� ��� ���Ҹ� �˻� 
// boolean offer(E e ) list�� ������ ��ġ�� ���� ���� 
////////////////////////////////////////////////////
//collection Ŭ���� , sort, reverse, shuffle, binarySearch

public class LinkedList2 {

	public static void main(String[] args) {
	
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("���");
		myList.add("�ٳ���");
		
		myList.add(0, "����");
		myList.add(2, "����");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "���");
		
		
	}

}
