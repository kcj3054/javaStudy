import java.lang.reflect.Constructor;

import com.sun.jdi.Field;


public class classForNameTest {

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class strClass = Class.forName("MyBook");
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println("===============");
		java.lang.reflect.Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		

	}

}
