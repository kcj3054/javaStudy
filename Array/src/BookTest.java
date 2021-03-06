
public class BookTest {

	public static void main(String[] args) {

		// 객체 배열을 할당하면 객체를 가리킬 주소값을 담을 배열들이 생성된다  => 초기값은 null 
		Book[] library = new Book[5]; 
		
		
		library[0] = new Book("책1", "창주");
		library[1] = new Book("책1", "창주");
		library[2] = new Book("책1", "창주");
		library[3] = new Book("책1", "창주");
		library[4] = new Book("책1", "창주");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].printInfo();
		}
		
		System.out.println("===================================");
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백1", "조창주1");
		bookArray1[1] = new Book("태백2", "조창주2");
		bookArray1[2] = new Book("태백3", "조창주3");
		
		//for 깊은 복사 
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//깊은복사 
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setName(bookArray1[i].getName());
		}
		
		//얕은복사 -> 주소가 복사된다, 값이 복사가 되는 것이 아니라 주소가 복사된다 .
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
		bookArray1[0].setName("그래나는창주");
		bookArray1[0].setAuthor("김창주");
		for (int i = 0; i < bookArray2.length; i++) {
			System.out.println("bookArray1값 변화 , 얕은 복사 현상 ");
			bookArray2[i].printInfo();
		}
		//깊은복사 -> 주소가아니라 값이 복사된다, 다른 인스턴스를 하나 더 만들어야한다 
	}

}
