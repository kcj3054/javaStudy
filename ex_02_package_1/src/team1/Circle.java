package team1;

public class Circle {

	final double PI = 3.14;
	double rad;
	
	public void setRad(double r) {
		rad = r;
		
	}
	
	//���� ���� ��ȯ 
	public double getArea()
	{
		return (rad * rad) * PI;
	}
}

