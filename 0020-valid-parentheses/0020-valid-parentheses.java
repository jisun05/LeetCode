class Solution {
    public boolean isValid(String s) {



        if(s.length()%2 != 0){
            return false;
        }


        Deque<Character> deque = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c == '(' ||  c =='[' || c == '{'){
                deque.push(c);
            }else{
                if(deque.isEmpty()) return false;
                if(!check(deque.pop(),c)) return false;
            }
        }

        if(deque.isEmpty()){
            return true;
        }

        return false;
    }



    public boolean check(char open,char close){
        if(open == '(' && close == ')') return true;
        if(open == '[' && close == ']') return true;
        if(open == '{' && close == '}') return true;

        return false;
    }
}