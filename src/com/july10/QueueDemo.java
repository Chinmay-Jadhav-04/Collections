package com.july10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
Queue<String>q=new LinkedList<>();
		
		q.offer("Tanuj");
		q.offer("Chinmay");
		q.offer("Rishabh");
		q.offer("Aum");
		q.offer("Yash");
		q.offer("Sagar");
		System.out.println(q);
		
Queue<String>a=new ArrayDeque<>();
		
		a.offer("Tanuj");
		a.offer("Chinmay");
		a.offer("Rishabh");
		a.offer("Aum");
		a.offer("Yash");
		a.offer("Sagar");
		System.out.println(a);
		System.out.println(a.poll());
		
Queue<String>b=new PriorityQueue<>();
		
		b.offer("Tanuj");
		b.offer("Chinmay");
		b.offer("Rishabh");
		b.offer("Aum");
		b.offer("Yash");
		b.offer("Sagar");
		System.out.println(b);
	}

}
