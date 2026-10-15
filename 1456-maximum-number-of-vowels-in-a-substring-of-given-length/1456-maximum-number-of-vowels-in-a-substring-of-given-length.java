class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(i >= k){
            char c = s.charAt(i - k);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count--;
            }
        }

            char p = s.charAt(i);
            if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u'){
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}