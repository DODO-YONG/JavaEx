package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//	입력방향과 출력방향이 반대다
	//	First Input First Output(FIFO)
	public static void main(String[] args) {
		//	실제 클래스가 없다
		Queue<Integer> queue = new LinkedList<>();
			
		//	데이터 제공
		for (int i = 1; i <= 10; i ++) {
			queue.offer(i);
			System.out.println("OFFER :" + queue);
			}
		System.out.println("Peek:" + queue.peek());
		System.out.println("queue:" + queue);
		
		while (!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());
			System.out.println("queue:" + queue);
		}
		}

	}

