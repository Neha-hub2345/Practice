class Solution {
    public int maxSubArray(int[] nums) {
        int Currentsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            Currentsum += nums[i];
            if(Currentsum > max){
                max = Currentsum;
            }
            if(Currentsum < 0){
                Currentsum = 0;
            }
        }
        return max;
    }
}