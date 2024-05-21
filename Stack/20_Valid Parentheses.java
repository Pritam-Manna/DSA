class Solution {
    public boolean isValid(String s) {
        char [] allChar = s.toCharArray();
        char lastCahr;

        Stack <Character> myStack = new Stack <Character>();

        for(char c : allChar){
            if(c == '('){
                myStack.push(')');
            }else if(c == '{'){
                myStack.push('}');
            }else if(c == '['){
                myStack.push(']');
            }else if(myStack.empty() || c != myStack.pop()){
                return false;
            }
        }
        return myStack.empty();
    }
}