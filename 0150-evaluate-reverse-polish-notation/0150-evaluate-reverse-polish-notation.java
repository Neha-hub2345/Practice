class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token : tokens){
            if(isOperator(token)){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(token.equals("+")){
                    res = num1 + num2;
                }
                else if(token.equals("-")){
                    res = num1 - num2;
                }
                else if(token.equals("*")){
                    res = num1 * num2;
                }
                else if(token.equals("/")){
                    res = num1 / num2;
                }
                stack.push(Integer.toString(res));
            }
            else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }
    private boolean isOperator(String str){
        if(str.equals("+") || str.equals("-") ||str.equals("*") ||str.equals("/")){
            return true;
        }
        return false;
    }
}