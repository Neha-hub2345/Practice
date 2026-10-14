class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        int current = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                current = num;
                int currentStreak = 1;
                while(set.contains(current + 1)){
                    current++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}