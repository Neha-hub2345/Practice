class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right<n; right++){
            sum += nums[right];
            while(sum >= target){
                min_len = Math.min(min_len, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return(min_len == Integer.MAX_VALUE)?0:min_len;
    }
}