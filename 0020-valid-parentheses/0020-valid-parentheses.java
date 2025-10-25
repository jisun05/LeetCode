class Solution {
    public boolean isValid(String s) {

        if(s == null || s.length()<2 || s.length() %2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>(); 
            
            for(int i =0; i< s.length();i++){
                if(s.charAt(i) == '(' || 
                   s.charAt(i) == '{' ||
                   s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                   }else {
                    if(stack.isEmpty()) return false;
                    char open = stack.peek();
                    char close = s.charAt(i);
                    if(!matchTrue(open,close)) return false;
                    stack.pop();
        
                   }
            }

               
                return stack.isEmpty();


        
        
    }
    boolean matchTrue(char open, char close){
            if(open == '(' && close == ')') return true;
            if(open == '[' && close == ']') return true;
            if(open == '{' && close == '}') return true;

            return false;
        }
}