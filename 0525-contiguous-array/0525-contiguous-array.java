import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        int res = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: a difference of 0 exists before the array starts (at index -1)
        map.put(0, -1);
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }
            
            int diff = zero - one;
            
            // If we have seen this difference before, calculate the length
            if (map.containsKey(diff)) {
                res = Math.max(res, i - map.get(diff));
            } else {
                // Otherwise, store the first time we see this difference
                map.put(diff, i);
            }
        }
        return res;
    }
}
