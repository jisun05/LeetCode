class Solution {
    public boolean isValid(String s) {

        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '[' || c =='{' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if(!check(open,c)) return false;
            }
            
        }

        if(stack.isEmpty()){
            return true;
        }


        return false;
    }


    public boolean check(char open, char close){
        if(open == '[' && close ==']') return true;
        if(open == '(' && close ==')') return true;
        if(open == '{' && close =='}') return true;

        return false;
    }

}