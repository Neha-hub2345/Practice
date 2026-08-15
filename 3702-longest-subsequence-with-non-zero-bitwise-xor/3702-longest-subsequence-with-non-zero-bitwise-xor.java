class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalxor = 0;
        boolean ans = false;

        for(int i : nums){
            totalxor ^= i;
            if(i != 0){
                ans = true;
            }
        }
        if(totalxor != 0){
            return n;
        }
        return ans ? n - 1 : 0;
    }
}