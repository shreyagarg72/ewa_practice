package org.ncu.finalexam;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(100);
		q.add(76);
		q.add(7);
		q.offer(12); // do not throw exception while adding
		System.out.println(q.poll());// remove head front se delete
		// rear se insert
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(76);
		pq.add(7); // hp of small element gets in front
		System.out.println(pq.peek());
	}

}
