package Stacks;

import java.util.Stack;

public class RemoveStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(removeStars("leet**cod*e"));
	}
	
	public static String removeStars(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '*') {
				stack.pop();
			}
			else {
				stack.add(s.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
		return sb.toString();
        
    }

}
