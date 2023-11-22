package core;
import java.util.ArrayList;
public class Stack implements IStack {

	ArrayList<Object> arr = new ArrayList<>();
	int size = -1;
	@Override
	public boolean isEmpty() {
		
		if(size == -1){
			return true;
		}
		
		return false;
	}

	@Override
	public int getSize() {
		if(isEmpty() == true) {
			return -1;
		}
		return size;
	}
	
	@Override
	public void push(Object elm) {
		arr.add(elm);
		size++;
	}
	
	@Override
	public Object top() {
		return arr.get(size);
	}
	
	@Override
	public Object pop() {
		Object p = top();
		arr.remove(size);
		size--;
		return p;
	}

	@Override
	public boolean checkStack() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
