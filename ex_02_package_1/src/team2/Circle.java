package team2;

public class Circle {

	final double PI = 3.14;
	double rad;
	
	public void setRad(double r)
	{
		rad = r;
	}
	
	//���� �ѷ� ��ȯ 
	public double getPerimeter() {
		return 2* rad * PI;
	}
}
