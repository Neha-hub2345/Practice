class Solution {
    public int totalFruit(int[] fruits) {
        // The fruit types are 0-indexed and bounded by the input array's length
        int[] count = new int[fruits.length]; 
        int low = 0;
        int maxLen = 0;
        int distinct = 0; // Tracks the number of unique fruits in our window
        
        for (int high = 0; high < fruits.length; high++) {
            // If the current fruit's count is 0, we just found a new distinct fruit
            if (count[fruits[high]] == 0) {
                distinct++;
            }
            count[fruits[high]]++;
            
            // Shrink the window if we exceed 2 distinct fruits
            while (distinct > 2) {
                count[fruits[low]]--;
                // If dropping this fruit brings its count to 0, decrement distinct
                if (count[fruits[low]] == 0) {
                    distinct--;
                }
                low++;
            }
            
            // Record the max length of a valid window
            maxLen = Math.max(maxLen, high - low + 1);
        }
        
        return maxLen;
    }
}