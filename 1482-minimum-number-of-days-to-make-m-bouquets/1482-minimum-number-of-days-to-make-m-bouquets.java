class Solution {
    public boolean canmakebouquet(int[] bloomDay, int m, int k, int guess){
        int f = 0;
        int b = 0;
        for(int i = 0; i< bloomDay.length; i++){
            if(bloomDay[i] <= guess){
                f++;
                if(f == k){
                    b++;
                    f = 0;
                }
            }
            else{
                f = 0;
            }
        }
        return b >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int day : bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int res = -1;
        while(low <= high){    
            int guess = low + (high - low) / 2;
            if(canmakebouquet(bloomDay, m ,k ,guess)){
                res = guess;
                high = guess - 1;
            }
            else{
                low = guess + 1;
            }
        }
        return res;
    }
}