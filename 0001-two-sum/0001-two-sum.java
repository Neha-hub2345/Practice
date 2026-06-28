class Solution {
    public static int[] twoSum(int nums[],int target){
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int right = i + 1; right < len; right++){
                if(nums[i] + nums[right] == target){
                    return new int[] {i, right};
                }
            }
        }
        return new int[0];
    }
}