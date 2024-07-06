class Solution {
    /**
    store the appropriate closing on each iteration
    if it aint closing, return false if stack isEmpty or char doesnt match pop
     */
    public boolean isValid(String s) {
        Stack<Character> stac = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='{'){
                stac.push('}');
            }
            else if(c=='['){
                stac.push(']');
            }
            else if(c=='('){
                stac.push(')');
            }
            // if the stack is empty or the top element does not match the closing bracket
            else if(stac.isEmpty() || stac.pop()!=c){
                return false;
            }
        }
        // sometimes there might me single or more char stuck in stack, for ex: I/p['{','(']
        return stac.isEmpty();
    }
}
