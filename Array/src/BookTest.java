
public class BookTest {

	public static void main(String[] args) {

		// ��ü �迭�� �Ҵ��ϸ� ��ü�� ����ų �ּҰ��� ���� �迭���� �����ȴ�  => �ʱⰪ�� null 
		Book[] library = new Book[5]; 
		
		
		library[0] = new Book("å1", "â��");
		library[1] = new Book("å1", "â��");
		library[2] = new Book("å1", "â��");
		library[3] = new Book("å1", "â��");
		library[4] = new Book("å1", "â��");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].printInfo();
		}
		
		System.out.println("===================================");
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹�1", "��â��1");
		bookArray1[1] = new Book("�¹�2", "��â��2");
		bookArray1[2] = new Book("�¹�3", "��â��3");
		
		//for ���� ���� 
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//�������� 
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setName(bookArray1[i].getName());
		}
		
		//�������� -> �ּҰ� ����ȴ�, ���� ���簡 �Ǵ� ���� �ƴ϶� �ּҰ� ����ȴ� .
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
		bookArray1[0].setName("�׷�����â��");
		bookArray1[0].setAuthor("��â��");
		for (int i = 0; i < bookArray2.length; i++) {
			System.out.println("bookArray1�� ��ȭ , ���� ���� ���� ");
			bookArray2[i].printInfo();
		}
		//�������� -> �ּҰ��ƴ϶� ���� ����ȴ�, �ٸ� �ν��Ͻ��� �ϳ� �� �������Ѵ� 
	}

}
