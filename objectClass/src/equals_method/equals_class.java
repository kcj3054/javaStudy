package equals_method;


//boolean equals(Object obj) �� ��ü�� ���� �� 
// ��ü�� ���빰�� ���ϱ� ���� Ŭ���Ľ��� �ɹ��� �ۼ�   if���� ��ü�� ����Ű�� ���� �� 
//�����ڿ��� ���ٰ� ���ϴ°��� ��ü�� ��ġ�� ���ؼ� �Ǵ��ϴ°�  !! �޸� ������ ������?���Ǵ�


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
		
		if(a.equals(b))System.out.println("����");
		if(a.equals(c))System.out.println("����");
		

	}

}
