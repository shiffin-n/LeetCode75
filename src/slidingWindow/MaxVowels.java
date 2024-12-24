package slidingWindow;

import java.util.Arrays;
import java.util.List;

public class MaxVowels {

	public static int maxVowels(String s, int k) {
        List<Character> charList = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'});
        int count =0;
        for(int i=0;i<k;i++) {
        	if(charList.contains(Character.toLowerCase(s.charAt(i)))) {
        		count++;
        	}
        }
        int tempCount = count;
        for(int i=k;i<s.length();i++) {
        	if(charList.contains(Character.toLowerCase(s.charAt(i-k)))) {
        		tempCount = tempCount - 1;
        	}
        	if(charList.contains(Character.toLowerCase(s.charAt(i)))) {
        		tempCount++;
        	}

        	if(tempCount > count) {
        		count = tempCount;
        	}
        	
        	if(count == k) {
        		break;
        	}
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxVowels("abciiidef", 3));

	}

}
