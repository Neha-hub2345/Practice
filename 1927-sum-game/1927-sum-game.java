class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double s1 = 0, s2 = 0;
        double q1 = 00, q2 = 0;

        for(int i = 0; i < n/2; i++){
            if(num.charAt(i) == '?'){
                q1++;
            }
            else{
                s1 += num.charAt(i) - '0';
            }
        }

        for(int i = n/2; i < n; i++){
            if(num.charAt(i) == '?'){
                q2++;
            }
            else{
                s2 += num.charAt(i) - '0';
            }
        }
        return (s1 -s2) != (9.0 *(q2 -q1) / 2.0);
    }
}