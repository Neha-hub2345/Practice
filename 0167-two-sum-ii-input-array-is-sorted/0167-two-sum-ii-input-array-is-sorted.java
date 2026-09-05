class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            for(int right = i + 1; right < n; right++ ){
                if(numbers[i] + numbers[right] == target){
                    return new int[] {i + 1, right + 1};
                }
            }
        }
        return new int[0];
    }
}