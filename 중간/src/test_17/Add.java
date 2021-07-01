package test_17;

public class Add extends Calc{
	
	@Override
	void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}

	@Override
	int calculate() {
		int result = super.a + super.b;
		return result;
	}

}
