class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }
        while(low<=high){
            int guess = low + (high - low) / 2;
            long hours = findH(piles,guess);

            if(hours > h){
                low = guess + 1;
            }
            else{
                ans = guess;
                high = guess - 1;
            }
        }
        return ans;
    }
    public static long findH(int[] piles, int guess){
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += Math.ceil((double) piles[i] / guess);
            //Math.ceil is used to round of fraction to it's next integer
        }
        return hours;
    }
}