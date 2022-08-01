package queue;

import java.util.PriorityQueue;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> qe=new PriorityQueue<>();
		
		qe.add(10);
		qe.add(30);
		qe.add(40);
		qe.add(50);
		qe.add(60);
		qe.add(80);
		qe.add(70);
		qe.add(50);
		qe.add(90);
		qe.add(100);
		
		System.out.println(qe);
		qe.remove();    //remove true or false
		System.out.println(qe);
		
		System.out.println("peek:"+qe.peek());
		System.out.println(qe.element());//head but it will throw exception when queue is emepty
		
		System.out.println("Poll:"+qe.poll());
		System.out.println(qe);
		
		System.out.println(qe.size());

		
		
	}

}
