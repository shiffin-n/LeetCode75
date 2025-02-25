package hashMapSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiffTwoArrays {

	public static void main(String[] args) {
		int[] v1 = new int[] {1,2,3,3};
		int[] v2 = new int[] {1,1,2,2};

		System.out.print(findDifference(v1, v2));
	}
	
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
	        
			Set<Integer> s1 = new HashSet<>();
	        Set<Integer> s2 = new HashSet<>();
	        for(int i =0;i<nums1.length;i++) {
	        	s1.add(nums1[i]);
	        }

	        for(int i =0;i<nums2.length;i++) {
	        	s2.add(nums2[i]);
	        }
	        
	        List<Integer> r1 = new ArrayList<>(s1);
	        List<Integer> r2 = new ArrayList<>(s2);

	        r1.removeAll(s2);
	        r2.removeAll(s1);

	        return List.of(r1, r2);
    }

}
