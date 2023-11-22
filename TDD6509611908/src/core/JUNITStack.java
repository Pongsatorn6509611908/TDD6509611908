package core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(-1, size);
		assertTrue(s1.isEmpty());
	}
	
	@Test
	public void PushElementToTop() {
		
		Stack s2 = new Stack();
		s2.push(10);
		
		assertEquals(10, s2.top());
	}
	
	@Test
	public void LastInFirstOut() {
		
		Stack s3 = new Stack();
		int temp1 = 1;
		int temp2 = 2;
		int temp3 = 3;
		s3.push(temp1);
		s3.push(temp2);
		s3.push(temp3);
		
		assertEquals(temp3, s3.pop());
		assertEquals(temp2, s3.pop());
		assertEquals(temp1, s3.pop());	
	}
}
