package arrayAndString;

public class MostWater {
	
	public static void maxArea(int[] height) {
        int max = 0, step =0, capacity = 0;
        for(int i=1;i<height.length;i++) {
        	step++;
        	int newCap = Math.min(height[max], height[i]) * step;
        	if(height[max] < height[i]) {
        		max = i;
        		step = 0;
        	}
        	if(newCap > capacity) {
        		capacity = newCap;
        	}
        }
        System.out.println(capacity);
    }
	
	public static void maxArea2(int[] height) {
        int left = 0, right =height.length-1, capacity = 0;
        while(left < right) {
        	int newCap = Math.min(height[left], height[right]) * (right - left);
        	
        	if(newCap > capacity) {
        		capacity = newCap;
        	}
        	if(height[left] < height[right]) {
        		left++;
        	}
        	else {
        		right--;
        	}
        }
        System.out.println(capacity);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {1,2,1};
		maxArea2(inp);
	}

}
