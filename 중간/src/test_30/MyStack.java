package test_30;

import java.util.Vector;

public class MyStack<T> implements IStack<Integer> {

	Vector<T> v = new Vector<>();
	
	@Override
	public Integer pop() {
		Integer curr = null;
		
		if(!v.isEmpty()) {
			curr = (Integer) v.lastElement();
			v.remove(v.size() - 1);
		}
		
		return curr;
	}

	@Override
	public boolean push(Integer ob) {
		return v.add((T) ob);
	}

}
