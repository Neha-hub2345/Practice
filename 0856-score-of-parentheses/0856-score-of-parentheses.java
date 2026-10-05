class Solution {
    public int scoreOfParentheses(String s) {
        int copen = 0;
        int score = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                copen++;
            }
            else{
                copen--;
                if(s.charAt(i - 1) == '('){
                    score += (1 << copen);
                }
            }
        }
        return score;
    }
}