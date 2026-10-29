class Solution {
    static class Pair {
        char first;
        int second;

        public Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(c, 1));
                continue;
            }
            if(st.peek().first != c){
                st.push(new Pair(c, 1));
                continue;
            }
            if (st.peek().second < (k - 1)) {
                Pair p = st.peek();
                st.pop();
                st.push(new Pair(p.first, p.second + 1));
            } else {
                // If it reaches exactly k, pop it out to remove the duplicates
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Pair p : st){
            for(int i = 0; i < p.second; i++){
                sb.append(p.first);
            }
        }
        return sb.toString();
    }
}