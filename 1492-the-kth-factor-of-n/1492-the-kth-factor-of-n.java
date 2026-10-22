class Solution {
    public int kthFactor(int n, int k) {
        int count = 0; 
        int factor = 1;
        for(; factor * factor < n; ++factor){
            if(n % factor == 0){
                count++;
                if(count == k) return factor;
            }
        }

        for(factor = n / factor; factor >= 1; --factor){
            if(n % factor == 0){
                count++;
                if(count == k) return n / factor;
            }
        }
        return -1;
    }
}