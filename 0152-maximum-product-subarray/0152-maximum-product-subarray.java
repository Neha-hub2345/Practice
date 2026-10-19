class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int leftmul = 1;
        int rightmul = 1;
        for(int i = 0; i < nums.length; i++){
            leftmul = (leftmul == 0 ? 1 : leftmul) * nums[i];
            rightmul = (rightmul == 0 ? 1 : rightmul) * nums[nums.length - 1 - i];

            max = Math.max(max, Math.max(leftmul, rightmul));
        }
        return max;
    }
}