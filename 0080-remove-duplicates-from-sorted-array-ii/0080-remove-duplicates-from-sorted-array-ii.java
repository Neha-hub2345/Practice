class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int i = 0;
        int j = 2;
        while(j < nums.length){
            if(nums[j] == nums[i]){
                j++;
                continue;
            }
            else{
                nums[i + 2] = nums[j];
                i++;
                j++;
            }
        }
        return i + 2;
    }
}