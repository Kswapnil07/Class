package Stack;

import java.util.Stack;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(60);
		s.push(50);
		s.push(30);
		s.push(170);
		s.push(90);
		s.push(80);
		s.push(130);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.contains(10));//vector
		System.out.println(s.peek()); //top element in your stack
		System.out.println(s.empty());
		System.out.println(s.search(50));//position of the element from top
		
	}

}
