package arrayAndString;

import java.util.HashMap;
import java.util.Map;

public class KSumMed {
	
	public static void maxOperations(int[] nums, int k) {
		Map<Integer, Integer> numCount = new HashMap<>();
		int res=0;
        for(int i=0;i<nums.length;i++) {
            if(numCount.containsKey(nums[i])) {
            	int count = numCount.get(nums[i]);
            	numCount.put(nums[i], ++count);
            }
            else {
            	numCount.put(nums[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
        	int key = entry.getKey();
        	if((k-key) != key) {
	        	if(entry.getValue() >0 && numCount.containsKey(k-key)) {
	        		int val = numCount.get(k-key);
	        		if(val > 0) {
	        			int diff = Math.min(val, entry.getValue());
	        			res = res + diff;
	        			numCount.put(k-key, val-diff);
	        			numCount.put(key, entry.getValue()-diff);
	        		}
	        	}
        	}
        	else {
        		if(entry.getValue() > 1) {
        			res += (int) Math.floor(entry.getValue()/2);
        			numCount.put(key, entry.getValue()-res);
        		}
        	}
        	
        }
        System.out.println(res);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
		maxOperations(arr, 3);
	}

}
