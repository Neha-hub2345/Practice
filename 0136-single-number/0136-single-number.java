class Solution {
    public static int singleNumber(int[] nums){
        for(int i = 0 ;i < nums.length; i++){
            int frequency = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    frequency++;
                }
            }
            if (frequency == 1) {
            return nums[i];
        }
    }
    return -1;
}
}