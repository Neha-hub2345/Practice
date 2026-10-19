class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (k > n || k <= 0) {
            return 0;
        }
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        double maxAvg = maxSum / k;
        return maxAvg;
    }
}