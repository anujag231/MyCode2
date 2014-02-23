package DataStructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSet {

	/*
	@Test
	public void testAdd() {
		Node h1 = new Node(0);
		Node h2 = new Node(1);
		Node h3 = new Node(2);
		Node h4 = new Node(3);
		Node h5 = new Node(4);
		Node h6 = new Node(5);
		Node h7 = new Node(6);
		Node h8 = new Node(7);
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		h6.next = h7;
		h7.next = h8;
		h8.next = null;
		LinkListAlternateRev.revList(h1);
	}*/
	
	@Test
	public void testQueue() {
		StackImpl s = new StackImpl();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.Pop();s.Pop();
		s.Pop();s.Pop();s.Pop();
	}

}
