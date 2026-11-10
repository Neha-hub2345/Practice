class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0; 
        int high = 0;
        for(int i = 0; i < n; i++){
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        int res = -1;

        while(low <= high){
            int guess = low + (high - low)/2;
            if(canallocate(weights, n, days, guess)){
                res = guess;
                high = guess - 1;
            }
            else{
                low = guess + 1;
            }
        }
        return res;
    }

    public static boolean canallocate(int[] weights, int n, int days, int limit){
        int k = 1;
        int wt = 0;
        for(int i = 0; i < n; i++){
            if(wt + weights[i] <= limit){
                wt += weights[i];
            }
            else{
                k++;
                wt = weights[i];
                if(k > days){
                    return false;
                }
            }
        }
        return true;
    }
}