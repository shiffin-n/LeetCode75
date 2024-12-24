package slidingWindow;

public class MaxAvgSubArray {
	
	public static double findMaxAverage(int[] nums, int k) {
        double avg =0;
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }
        int temp = sum;
        for(int j=k;j<nums.length;j++) {
            temp = temp - nums[j-k] + nums[j];
            if(sum < temp) {
                sum = temp;
            }
        }

        return sum/(double)k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(nums, 4));
	}

}
