package arrayAndString;

public class testLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("arrayAndString");
	}
	
	public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = (split.length - 1); i>0;i--) {
        	res.append(split[i]).append(" ");
        }
        
        return res.toString();
    }
	
	public int[] productExceptSelf(int[] nums) {
        int i=0, j=1;
        int[] res = new int[nums.length];
        int prod = 1;
        while(i < nums.length) {
        	if(i != j) {
        		prod *= nums[j];
        		j++;
        	}
        	if(j == nums.length) {
                System.out.println("Prod: "+ prod);
        		res[i] = prod;
        		i++;
        		j=0;
        		prod=1;
        	}
        }
        return res;
    }
	
}
