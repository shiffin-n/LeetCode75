package Stacks;

import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	asteroidCollision(new int[] {-2,-1,1,2});
	}
	
	public static int[] asteroidCollision(int[] asteroids) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<asteroids.length;i++) {
			if(asteroids[i] < 0 && !stack.empty()) {
				int top = stack.peek();
				while(!stack.empty() && top >0 && top <= Math.abs(asteroids[i])) {
					stack.pop();
					if(!stack.empty()) {
						top = stack.peek();
					}
				}
			}
			else {
				stack.add(asteroids[i]);
			}
			
		}
		System.out.println(stack);
		return stack.stream().mapToInt(i -> i).toArray();
        
    }

}
