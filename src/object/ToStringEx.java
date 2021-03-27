package object;
//해쉬 코드 : jvm에 힙 메모리에 instance 코드값이 생성된 코드 값
/*
hash , Serch에서 유용하다
key값을 가지고 빠르게 탐색할 수 있다
hashCode heap 주소를 반환해준다
힙 메모리에 인스턴스가 저장되는 방식이 hash

 */
class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title +", " + author;
    }
}

public class ToStringEx {

    public static void main(String[] args) {

        Book book = new Book("do it", "은종님");
        System.out.println(book);


    }


}
