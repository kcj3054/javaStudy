package collection;

import java.util.Vector;

//�÷����� �ڷ� ������ ������ Ŭ���� , ��ü�� ���� �׷��� �⺻Ÿ���� wrapperŬ���� ���

//collection �������̽��� �ֿ� �޼ҵ�
//int size() ���� ���� ��ȯ, boolean isEmpty() ���Ҿ����� true��ȯ, 
//boolean add(E e) �����߰��ϰ� �����ȯ , remove, Iterator<E> iterator() 
//void clear() �÷��� ��� ���� ���� 

//���׸��� �ڷ��� ���ص����ʰ� ��ü���� �޼ҵ� �����Ҷ� �������� 

//vector Ŭ���� 
//������ �߰�, ����, ���� ���� 
//vector() ��ü ��ü ����, 10�� ������ ���� ũ�� ���� 
//vector(int size, int capacity) 
//size�� �ʱ�ũ��, size capacity, capacity�� �뷮, size�� ����Ǿ��ִ� ũ�� 

//v.set(1, -5) set�� ���� �����ϴ� ���̴�. �ε���1���� -5�� ����  


//void addElement(Object o) �����߰�(������ ��ġ) 

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
