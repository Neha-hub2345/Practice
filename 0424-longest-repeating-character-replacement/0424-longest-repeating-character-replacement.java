class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int maxCount = 0;
        int[] f = new int[26];
        int res = 0;
        for(int high = 0; high < s.length(); high++){
            char c = s.charAt(high);
            f[c - 'A']++;
            maxCount = Math.max(maxCount, f[c - 'A']);
            while((high - low + 1) - maxCount > k){
                f[s.charAt(low) - 'A']--;
                low++;
            }
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}