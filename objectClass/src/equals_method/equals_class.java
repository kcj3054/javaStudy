package equals_method;


//boolean equals(Object obj) 두 객체의 내용 비교 
// 객체의 내용물을 비교하기 위한 클래ㅔ스의 맴버로 작성   if문은 객체가 가리키는 것을 비교 
//상등연산자에서 같다고 비교하는것은 객체의 위치를 비교해서 판단하는거  !! 메모리 번지가 같느냐?를판단


public class equals_class {

	int width, height;
	
	equals_class(int width, int height){
	
		this.width = width;
		this.height = height;
		
	}
	
	public boolean equals(equals_class p) {
		
		if(width == p.width && height == p.height) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		equals_class a = new equals_class(15, 20);
		equals_class b = new equals_class(15, 20);
		equals_class c = new equals_class(30, 20);
		
		if(a.equals(b))System.out.println("같다");
		if(a.equals(c))System.out.println("같다");
		

	}

}
