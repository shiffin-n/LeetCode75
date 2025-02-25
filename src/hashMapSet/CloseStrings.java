package hashMapSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CloseStrings {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "bca";

	System.out.println(closeStrings(s1,s2));
	}

	public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
			return false;
			
		Map<Character, Integer> c1 = new HashMap<>();
		Map<Character, Integer> c2 = new HashMap<>();
		
		for(int i=0;i<word1.length();i++) {
			int l1 = c1.getOrDefault(word1.charAt(i), 0);
			int l2 = c2.getOrDefault(word2.charAt(i), 0);
			
			c1.put(word1.charAt(i), ++l1);
			c2.put(word2.charAt(i), ++l2);
		}
		
		Set<Character> s1 = c1.keySet();
		Set<Character> s2 = c2.keySet();
		
		if(s1.containsAll(s2)) {
			List<Integer> v1 = new ArrayList<>(c1.values());
			List<Integer> v2 = new ArrayList<>(c2.values());
			
			Collections.sort(v1);
			Collections.sort(v2);
			
			return v1.equals(v2);
		}
		else {
			return false;
		}
		
    }
}
